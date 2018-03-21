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
 *我掌握的语言
 */
@Entity
@Table
public class MyLanguage {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer myid;
	
	@ManyToOne
	@JoinColumn(name="lid")
	private Language language;//语言ID
	

	@ManyToOne
	@JoinColumn(name="aid")
	private Account account;//用户id


	public Integer getMyid() {
		return myid;
	}


	public void setMyid(Integer myid) {
		this.myid = myid;
	}


	public Language getLanguage() {
		return language;
	}


	public void setLanguage(Language language) {
		this.language = language;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
