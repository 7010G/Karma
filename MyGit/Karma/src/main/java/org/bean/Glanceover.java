package org.bean;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author 14020
 *浏览记录表
 */
@Entity
@Table
public class Glanceover {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer gid;
	
	@ManyToOne
	@JoinColumn(name="kfaid")
	private Account account;//看方用户id
	
	@ManyToOne
	@JoinColumn(name="bkfaid")
	private Account account2;//被看方用户id
	
	
	private Date sccesstime;//访问时间


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


	public Account getAccount2() {
		return account2;
	}


	public void setAccount2(Account account2) {
		this.account2 = account2;
	}


	public Date getSccesstime() {
		return sccesstime;
	}


	public void setSccesstime(Date sccesstime) {
		this.sccesstime = sccesstime;
	}
	
	
	

}
