package in.mahesh.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Facebook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fId;
	private String name;
	private String mailId;
	private Long phNo;
	private String gender;
	private LocalDate DOB;
	public Integer getfId() {
		return fId;
	}
	public void setfId(Integer fId) {
		this.fId = fId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Facebook [fId=" + fId + ", name=" + name + ", mailId=" + mailId + ", phNo=" + phNo + ", gender="
				+ gender + ", DOB=" + DOB + "]";
	}
	
	
	

}
