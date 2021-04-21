package com.oneapp.icf.assignment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EDUCATIONAL_QUALIFICATION")
public class EducationQualificationDo implements BaseDo,Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", columnDefinition = "VARCHAR(200)")
	private String id;
	
	@Id
	@Column(name = "EMPLOYMENT_ID" , columnDefinition = "VARCHAR(200)")
	private String employmentId;
	
	@Column(name = "TYPE" , columnDefinition = "VARCHAR(200)")
	private String type;
	
	@Column(name = "START_DATE" , columnDefinition = "VARCHAR(200)")
	private String startDate;
	
	@Column(name = "END_DATE" , columnDefinition = "VARCHAR(200)")
	private String endDate;
	
	@Column(name = "INSTITUTION" , columnDefinition = "VARCHAR(200)")
	private String institution;
	
	@Column(name = "ADDRESS" , columnDefinition = "VARCHAR(200)")
	private String address;
	
	@Column(name = "PERCENTAGE" , columnDefinition = "VARCHAR(200)")
	private String percentage;

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmploymentId() {
		return employmentId;
	}

	public void setEmploymentId(String employmentId) {
		this.employmentId = employmentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EducationQualificationDo [id=" + id + ", employmentId=" + employmentId + ", type=" + type
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", institution=" + institution + ", address="
				+ address + ", percentage=" + percentage + "]";
	}
	
	

}
