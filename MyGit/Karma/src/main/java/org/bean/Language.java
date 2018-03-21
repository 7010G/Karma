package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 14020
 *”Ô—‘±Ì
 */
@Entity
@Table
public class Language { 
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer lid;
	
	private String languageclass;//”Ô—‘÷÷¿‡

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLanguageclass() {
		return languageclass;
	}

	public void setLanguageclass(String languageclass) {
		this.languageclass = languageclass;
	}
	
	
	
} 