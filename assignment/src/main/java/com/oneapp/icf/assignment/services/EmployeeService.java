package com.oneapp.icf.assignment.services;

import java.util.List;

import com.oneapp.icf.assignment.dto.EmployeeDetailsDto;
import com.oneapp.icf.assignment.entity.EmployeeDetailsDo;

public interface EmployeeService {

	List<EmployeeDetailsDo> getAllEmployee();

	EmployeeDetailsDto getEmployeeById(String employeeId);

	String deleteEmployee(String employeeId);

	String createNewEmployee(EmployeeDetailsDto employeeDetailsDto);

	String updateEmployee(EmployeeDetailsDto employeeDetailsDto);
	
}
