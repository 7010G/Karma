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
 *充值记录表
 */
@Entity
@Table
public class WebsiteTake {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer wid;
	
	@ManyToOne
	@JoinColumn(name="aid")
	private Account account;//回复发表人id
	
	private Date topuptime;//充值时间
	
	private Integer topup;//充值金额

	public Integer getWid() {
		return wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getTopuptime() {
		return topuptime;
	}

	public void setTopuptime(Date topuptime) {
		this.topuptime = topuptime;
	}

	public Integer getTopup() {
		return topup;
	}

	public void setTopup(Integer topup) {
		this.topup = topup;
	}
	
	
	

}
