package com.oneapp.icf.assignment.dto;

public class EducationQualificationDto {
	
	private String id;
	private String employmentId;
	private String type;
	private String startDate;
	private String endDate;
	private String institution;
	private String address;
	private String percentage;

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


	@Override
	public String toString() {
		return "EducationQualificationDo [id=" + id + ", employmentId=" + employmentId + ", type=" + type
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", institution=" + institution + ", address="
				+ address + ", percentage=" + percentage + "]";
	}
	
	

}
