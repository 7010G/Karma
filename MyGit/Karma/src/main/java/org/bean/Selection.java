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
 *��żҪ���
 */
@Entity
@Table

public class Selection {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer sid;
	
	private int age; //����
	
	private int height;//���
	
	private String national;//����
	
	private String education;//ѧ��
	
	private String maritalstatus;//����״��
	
	private String tolive;//��ס��
	
	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//�û�id

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getTolive() {
		return tolive;
	}

	public void setTolive(String tolive) {
		this.tolive = tolive;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	

}
