package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 14020 生活方式表
 */
@Entity
@Table
public class Lifestyle {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer lid;

	private String smoking;// 吸烟
	
	private String drinking;// 饮酒
	
	private String exercise;// 锻炼习惯
	
	private String diet;// 饮食习惯
	
	private String shopping;// 逛街购物
	
	private String religious;// 宗教信仰
	
	private String time;// 作息时间
	
	private String circle;// 交际圈子
	
	private String maxconsumption;// 最大消费
	
	private String housework;// 家务水平等级
	
	private String distribution;// 家务分配情况
	
	private String howmuchpetslike;// 宠物喜欢程度

	private String pet;// 关于宠物
	
	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//用户id

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getSmoking() {
		return smoking;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public String getDrinking() {
		return drinking;
	}

	public void setDrinking(String drinking) {
		this.drinking = drinking;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getShopping() {
		return shopping;
	}

	public void setShopping(String shopping) {
		this.shopping = shopping;
	}

	public String getReligious() {
		return religious;
	}

	public void setReligious(String religious) {
		this.religious = religious;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getMaxconsumption() {
		return maxconsumption;
	}

	public void setMaxconsumption(String maxconsumption) {
		this.maxconsumption = maxconsumption;
	}

	public String getHousework() {
		return housework;
	}

	public void setHousework(String housework) {
		this.housework = housework;
	}

	public String getDistribution() {
		return distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public String getHowmuchpetslike() {
		return howmuchpetslike;
	}

	public void setHowmuchpetslike(String howmuchpetslike) {
		this.howmuchpetslike = howmuchpetslike;
	}

	public String getPet() {
		return pet;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	

}
