package org.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 14020
 *���������
 */
@Entity
@Table
public class Marriage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer mid;
	
	private String nativeplace;//����
	
	private String countries;//����
	
	private String characters;//��������
	
	private String asenseofhumor;//��Ĭ��
	
	private String temper;//Ƣ��
	
	private String treataffection;//�Դ�����
	
	private String child;//�Ƿ���ҪС��
	
	private String married;//��ʱ���
	
	private String anotherplace;//�Ƿ���������
	
	private String Parentshome;//Ը����Է���ĸͬס
	
	private String ranking;//��������
	
	private String brothersandsisters;//�ֵܽ���

	private String situation;//��ĸ���

	private String fatherwork;//���׹���
	
	private String motherwork;//ĸ�׹���
	
	private String economic;//��ĸ�������
	
	private String healthcare;//��ĸҽ�����

	@OneToOne
	@JoinColumn(name="aid")
	private Account account;//�û�id

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getNativeplace() {
		return nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	public String getCharacter() {
		return characters;
	}

	public void setCharacter(String characters) {
		this.characters = characters;
	}

	public String getAsenseofhumor() {
		return asenseofhumor;
	}

	public void setAsenseofhumor(String asenseofhumor) {
		this.asenseofhumor = asenseofhumor;
	}

	public String getTemper() {
		return temper;
	}

	public void setTemper(String temper) {
		this.temper = temper;
	}

	public String getTreataffection() {
		return treataffection;
	}

	public void setTreataffection(String treataffection) {
		this.treataffection = treataffection;
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public String getAnotherplace() {
		return anotherplace;
	}

	public void setAnotherplace(String anotherplace) {
		this.anotherplace = anotherplace;
	}

	public String getParentshome() {
		return Parentshome;
	}

	public void setParentshome(String parentshome) {
		Parentshome = parentshome;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getBrothersandsisters() {
		return brothersandsisters;
	}

	public void setBrothersandsisters(String brothersandsisters) {
		this.brothersandsisters = brothersandsisters;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getFatherwork() {
		return fatherwork;
	}

	public void setFatherwork(String fatherwork) {
		this.fatherwork = fatherwork;
	}

	public String getMotherwork() {
		return motherwork;
	}

	public void setMotherwork(String motherwork) {
		this.motherwork = motherwork;
	}

	public String getEconomic() {
		return economic;
	}

	public void setEconomic(String economic) {
		this.economic = economic;
	}

	public String getHealthcare() {
		return healthcare;
	}

	public void setHealthcare(String healthcare) {
		this.healthcare = healthcare;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
}
