package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 14020
 *Ȩ�ޱ�
 */
@Entity
@Table
public class Authority {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer auid;
	
	
	private String AuthoritynName;//����

	public Integer getAuid() {
		return auid;
	}

	public void setAuid(Integer auid) {
		this.auid = auid;
	}


	public String getAuthoritynName() {
		return AuthoritynName;
	}

	public void setAuthoritynName(String authoritynName) {
		AuthoritynName = authoritynName;
	}


	
	

}
