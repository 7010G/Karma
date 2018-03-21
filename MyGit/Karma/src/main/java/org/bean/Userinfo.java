package org.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author 14020
 *�û�������Ϣ��
 */
@Entity
@Table
public class Userinfo {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer uid;
	
	@DateTimeFormat
	private Date birthday;//��������
	
	private String zodiac;//��Ф
	
	private String constellation;//����
	
	private String education;//ѧ��
	
	private String maritalstatus;//����״��
	
	private Integer stature;// ���
	
	private String sex;//�Ա�
	
	private String children;//������Ů
	
	private String area;//����
	
	private String nativeplace;//����
	
	private String bloodtype;//Ѫ��
	
	private String national;//����
	
	private Integer monthlypay;//��н
	
	private String housing;//��ס���
	
	private String acar;//�������
	
	private String signature;//����ǩ��
	
	private String hobby;//��Ȥ����
	
	private Integer charm;//����ֵ
	@DateTimeFormat
	private Date lastlandingtime;//����½ʱ��

	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//�û�id

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getZodiac() {
		return zodiac;
	}

	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
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

	public Integer getStature() {
		return stature;
	}

	public void setStature(Integer stature) {
		this.stature = stature;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNativeplace() {
		return nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public String getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public Integer getMonthlypay() {
		return monthlypay;
	}

	public void setMonthlypay(Integer monthlypay) {
		this.monthlypay = monthlypay;
	}

	public String getHousing() {
		return housing;
	}

	public void setHousing(String housing) {
		this.housing = housing;
	}

	public String getAcar() {
		return acar;
	}

	public void setAcar(String acar) {
		this.acar = acar;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Integer getCharm() {
		return charm;
	}

	public void setCharm(Integer charm) {
		this.charm = charm;
	}

	public Date getLastlandingtime() {
		return lastlandingtime;
	}

	public void setLastlandingtime(Date lastlandingtime) {
		this.lastlandingtime = lastlandingtime;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	

}
