package org.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * �û���
 * @author 14020
 *
 */

@Entity
@Table
public class Account {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer aid;
	
	private String phone;//�ֻ���
	
	private String password;//����
	
	private String idcard;//���֤
	
	private String nickname ;//�ǳ�

	@ManyToOne
	@JoinColumn(name="auid")
	private Authority authority; //Ȩ��ID

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}
	
	

}
