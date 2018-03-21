package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 14020 外貌体征表
 */

@Entity
@Table
public class Physical {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer pid;

	private Integer weight;// 体重

	private String size;// 体型

	private String faceshape;// 脸型

	private String health;// 健康情况

	private String style;// 穿衣风格

	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//用户id

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFaceshape() {
		return faceshape;
	}

	public void setFaceshape(String faceshape) {
		this.faceshape = faceshape;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}


	
	
}
