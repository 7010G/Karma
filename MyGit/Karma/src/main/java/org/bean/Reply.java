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
 *�ظ���
 */

@Entity
@Table
public class Reply {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer  rid;
	
	private Date date;//�ظ�����
	
	private String text;//�ظ�����
	
	@ManyToOne
	@JoinColumn(name="aid")
	private Account account;//�ظ�������id

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
