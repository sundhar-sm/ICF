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
@Table(name = "DEPENDENT_EMPLOYEE")
public class DependentEmployeeDo implements BaseDo,Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID" , columnDefinition = "VARCHAR(200)")
	private String id;

	@Id
	@Column(name = "EMPLOYMENT_ID" , columnDefinition = "VARCHAR(200)")
	private String employmentId;

	@Column(name = "FIRST_NAME", columnDefinition = "VARCHAR(200)")
	private String firstName;
	
	@Column(name = "LAST_NAME" , columnDefinition = "VARCHAR(200)")
	private String lastName;
	
	@Column(name = "DOB")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	
	@Column(name = "RELATIONSHIP" , columnDefinition = "VARCHAR(200)")
	private String relationShip;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DependentEmployeeDo [id=" + id + ", employmentId=" + employmentId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dob=" + dob + ", relationShip=" + relationShip + "]";
	}
	
	
}
