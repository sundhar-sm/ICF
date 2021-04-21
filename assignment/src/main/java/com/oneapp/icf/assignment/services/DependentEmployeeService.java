package com.oneapp.icf.assignment.services;

import java.util.List;

import com.oneapp.icf.assignment.dto.EmployeeDetailsDto;
import com.oneapp.icf.assignment.entity.EmployeeDetailsDo;

public interface DependentEmployeeService {

	List<EmployeeDetailsDo> getAllDependentEmployee();

	EmployeeDetailsDto getDependentEmployeeById(String employeeId);

	String deleteDependentEmployee(String employeeId);

	String createNewDependentEmployee(EmployeeDetailsDto employeeDetailsDto);

	String updateDependentEmployee(EmployeeDetailsDto employeeDetailsDto);
	
}
