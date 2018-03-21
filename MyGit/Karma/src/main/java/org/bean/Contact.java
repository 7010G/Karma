package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 14020
 *��ϵ��ʽ��
 */
@Entity
@Table
public class Contact {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer cid;
	private String name;//��ʵ����
	private String email;//����
	private Integer QQ;//QQ
	private String MSN;//MSN
	private String address;//ͨ�ŵ�ַ
	private Integer zipcode;//�ʱ�
	
	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//�û�id

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getQQ() {
		return QQ;
	}

	public void setQQ(Integer qQ) {
		QQ = qQ;
	}

	public String getMSN() {
		return MSN;
	}

	public void setMSN(String mSN) {
		MSN = mSN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
