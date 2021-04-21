package com.oneapp.icf.assignment.dto;

import java.sql.Date;


public class DependentEmployeeDto {
	
	private String id;
	private String employmentId;
	private String firstName;
	private String lastName;
	private Date dob;
	private String relationShip;

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getRelationShip() {
		return relationShip;
	}

	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}

	@Override
	public String toString() {
		return "DependentEmployeeDo [id=" + id + ", employmentId=" + employmentId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dob=" + dob + ", relationShip=" + relationShip + "]";
	}
	
	
}
