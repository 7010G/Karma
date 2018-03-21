package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 14020 ��ò������
 */

@Entity
@Table
public class Physical {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer pid;

	private Integer weight;// ����

	private String size;// ����

	private String faceshape;// ����

	private String health;// �������

	private String style;// ���·��

	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//�û�id

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
