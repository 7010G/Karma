package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author 14020
 *��Ƭ��
 */

@Entity
@Table
public class Photos {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer pid;
	
	private String photo;//�ҵ���Ƭ
	
	private String headportrait;//�ҵ�ͷ��

	@ManyToOne
	@JoinColumn(name="aid")
	private Account account;//�û�id

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getHeadportrait() {
		return headportrait;
	}

	public void setHeadportrait(String headportrait) {
		this.headportrait = headportrait;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
}



