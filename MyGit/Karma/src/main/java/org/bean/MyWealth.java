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
 *我的财富表
 */
@Entity
@Table
public class MyWealth {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer mid;
	
	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//用户id
	private double virtuals;//我的豆币

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getVirtual() {
		return virtuals;
	}

	public void setVirtual(double virtuals) {
		this.virtuals = virtuals;
	}
	
	
	
	
}
