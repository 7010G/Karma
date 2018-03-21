package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//����ֿ�
@Entity
@Table
public class GiftWarehouse {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer gid;
	
	@ManyToOne
	@JoinColumn(name="aid")
	private Account account;//�û�id
	
	@ManyToOne
	@JoinColumn(name="pid")
	private Present present;//����ID

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Present getPresent() {
		return present;
	}

	public void setPresent(Present present) {
		this.present = present;
	}
	
	
}
