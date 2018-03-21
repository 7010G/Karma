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
 *�����
 */

@Entity
@Table
public class Present {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer pid;
	
	private String pname;//��������
	
	private String pmoney;//����۸�
	
	private Integer charm;//����ֵ
	
	private Integer sentiment;//����
	
	private Date time;//����ʱ��
	
	private String introduction;//������
	
	@ManyToOne
	@JoinColumn(name="pcid")
	private PresentClass pClass;//����ID//���

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPmoney() {
		return pmoney;
	}

	public void setPmoney(String pmoney) {
		this.pmoney = pmoney;
	}

	public Integer getCharm() {
		return charm;
	}

	public void setCharm(Integer charm) {
		this.charm = charm;
	}

	public Integer getSentiment() {
		return sentiment;
	}

	public void setSentiment(Integer sentiment) {
		this.sentiment = sentiment;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public PresentClass getpClass() {
		return pClass;
	}

	public void setpClass(PresentClass pClass) {
		this.pClass = pClass;
	}
	
    
	

}
