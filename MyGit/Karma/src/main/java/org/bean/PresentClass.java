package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 14020
 *礼物类别表
 */
@Entity
@Table
public class PresentClass {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer pid;
	
	private String presentclassname;//类别名称

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPresentclassname() {
		return presentclassname;
	}

	public void setPresentclassname(String presentclassname) {
		this.presentclassname = presentclassname;
	}
	
	

}
