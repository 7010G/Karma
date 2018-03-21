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
 *用户基本信息表
 */
@Entity
@Table
public class Userinfo {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer uid;
	
	@DateTimeFormat
	private Date birthday;//出生日期
	
	private String zodiac;//生肖
	
	private String constellation;//星座
	
	private String education;//学历
	
	private String maritalstatus;//婚姻状况
	
	private Integer stature;// 身高
	
	private String sex;//性别
	
	private String children;//有无子女
	
	private String area;//地区
	
	private String nativeplace;//户口
	
	private String bloodtype;//血型
	
	private String national;//民族
	
	private Integer monthlypay;//月薪
	
	private String housing;//居住情况
	
	private String acar;//购车情况
	
	private String signature;//个性签名
	
	private String hobby;//兴趣爱好
	
	private Integer charm;//魅力值
	@DateTimeFormat
	private Date lastlandingtime;//最后登陆时间

	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//用户id

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
