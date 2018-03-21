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
 *礼物记录表
 */
@Entity
@Table
public class PresentTake {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer pid;
	
	@ManyToOne
	@JoinColumn(name="Sendaid")
	private Account account;//送出的用户id
	
	@ManyToOne
	@JoinColumn(name="recaid")
	private Account accounts;//收礼人id
	
	@ManyToOne
	@JoinColumn(name="Sendpid")
	private Present present;
	
	@ManyToOne
	@JoinColumn(name="recpid")
	private Present presents;
	
	
	private Date sendouttime;//送出时间


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public Account getAccounts() {
		return accounts;
	}


	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}


	public Present getPresent() {
		return present;
	}


	public void setPresent(Present present) {
		this.present = present;
	}


	public Present getPresents() {
		return presents;
	}


	public void setPresents(Present presents) {
		this.presents = presents;
	}


	public Date getSendouttime() {
		return sendouttime;
	}


	public void setSendouttime(Date sendouttime) {
		this.sendouttime = sendouttime;
	}
	
	
}
