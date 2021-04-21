package com.oneapp.icf.assignment.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeDetailsDo implements BaseDo,Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", columnDefinition = "VARCHAR(200)")
	private String id;

	@Column(name = "FIRST_NAME", columnDefinition = "VARCHAR(200)")
	private String firstName;
	
	@Column(name = "LAST_NAME" , columnDefinition = "VARCHAR(200)")
	private String lastName;
	
	@Id
	@Column(name = "EMPLOYMENT_ID" , columnDefinition = "VARCHAR(200)")
	private String employmentId;
	
	@Column(name = "START_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Column(name = "END_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	@Column(name = "DESIGNATION" , columnDefinition = "VARCHAR(200)")
	private String designation;
	
	@Column(name = "DEPARTMENT" , columnDefinition = "VARCHAR(200)")
	private String department;
	
	@Column(name = "STATUS" , columnDefinition = "VARCHAR(200)")
	private String status;
	
	@Column(name = "DOB")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	
	@Column(name = "REPORTING_MANAGER" , columnDefinition = "VARCHAR(200)")
	private String reportingManager;
	
	@Column(name = "GENDER" , columnDefinition = "VARCHAR(200)")
	private String gender;
	
	@Column(name = "BLOOD_GROUP" , columnDefinition = "VARCHAR(200)")
	private String bloodGroup;
	
	@Column(name = "ADDRESS" , columnDefinition = "VARCHAR(200)")
	private String address;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmploymentId() {
		return employmentId;
	}

	public void setEmploymentId(String employmentId) {
		this.employmentId = employmentId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EmployeeDetailsDo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", employmentId="
				+ employmentId + ", startDate=" + startDate + ", endDate=" + endDate + ", designation=" + designation
				+ ", department=" + department + ", status=" + status + ", dob=" + dob + ", reportingManager="
				+ reportingManager + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", address=" + address + "]";
	}
	
	
		
	
	
}
