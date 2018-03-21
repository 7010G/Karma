package org.bean;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 14020
 *消费记录表
 */

@Entity
@Table
public class ConsumeTake {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer cid;
	
	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//用户id
	
	private Date Contime;//消费时间
	private double Consumption;//消费金额

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getContime() {
		return Contime;
	}

	public void setContime(Date contime) {
		Contime = contime;
	}

	public double getConsumption() {
		return Consumption;
	}

	public void setConsumption(double consumption) {
		Consumption = consumption;
	}
	
	
	

}
