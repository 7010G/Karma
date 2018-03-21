package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 14020
 *����ѧϰ��
 */
@Entity
@Table
public class Workstudy {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer wid;
	
	private String profes;//ְҵ
	
	private String industry;//��˾��ҵ
	
	private String type;//��˾����
	
	private String workingstate;//����״̬
	
	private String careerandfamily;//��ҵ���ͥ
	
	private String school;//��ҵѧУ
	
	private String professional;//רҵ����

	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//�û�id

	public Integer getWid() {
		return wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public String getProfes() {
		return profes;
	}

	public void setProfes(String profes) {
		this.profes = profes;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWorkingstate() {
		return workingstate;
	}

	public void setWorkingstate(String workingstate) {
		this.workingstate = workingstate;
	}

	public String getCareerandfamily() {
		return careerandfamily;
	}

	public void setCareerandfamily(String careerandfamily) {
		this.careerandfamily = careerandfamily;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}



	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}
