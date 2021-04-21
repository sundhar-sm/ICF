package com.oneapp.icf.assignment.dao;

import org.springframework.stereotype.Repository;

import com.oneapp.icf.assignment.dto.EmployeeDetailsDto;
import com.oneapp.icf.assignment.entity.EmployeeDetailsDo;

@Repository
public class EmployeeDao {

	public EmployeeDetailsDo importDto(EmployeeDetailsDto fromDto) {
		EmployeeDetailsDo entity = new EmployeeDetailsDo();

		entity.setAddress(fromDto.getAddress());
		entity.setBloodGroup(fromDto.getBloodGroup());
		entity.setDepartment(fromDto.getDepartment());
		entity.setDesignation(fromDto.getDesignation());
		entity.setDob(fromDto.getDob());
		entity.setEmploymentId(fromDto.getEmploymentId());
		entity.setEndDate(fromDto.getEndDate());
		entity.setFirstName(fromDto.getFirstName());
		entity.setGender(fromDto.getGender());
		entity.setId(fromDto.getId());
		entity.setLastName(fromDto.getLastName());
		entity.setReportingManager(fromDto.getReportingManager());
		entity.setStartDate(fromDto.getStartDate());
		entity.setStatus(fromDto.getStatus());
		return entity;
	}

	public EmployeeDetailsDto exportDto(EmployeeDetailsDo entity) {
		
		EmployeeDetailsDto dto = new EmployeeDetailsDto();

		dto.setAddress(entity.getAddress());
		dto.setBloodGroup(entity.getBloodGroup());
		dto.setDepartment(entity.getDepartment());
		dto.setDesignation(entity.getDesignation());
		dto.setDob(entity.getDob());
		dto.setEmploymentId(entity.getEmploymentId());
		dto.setEndDate(entity.getEndDate());
		dto.setFirstName(entity.getFirstName());
		dto.setGender(entity.getGender());
		dto.setId(entity.getId());
		dto.setLastName(entity.getLastName());
		dto.setReportingManager(entity.getReportingManager());
		dto.setStartDate(entity.getStartDate());
		dto.setStatus(entity.getStatus());
		return dto;
	}

}
