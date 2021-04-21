package com.oneapp.icf.assignment.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneapp.icf.assignment.dao.EmployeeDao;
import com.oneapp.icf.assignment.dao.EmployeeRepository;
import com.oneapp.icf.assignment.dto.EmployeeDetailsDto;
import com.oneapp.icf.assignment.entity.EmployeeDetailsDo;

@Service
public class EducationalQualificationServiceImpl implements EmployeeService {
	
	@Autowired  
	EmployeeRepository employeeRepository;
	
	@Autowired  
	EmployeeDao employeeDao;
	
	@Override
	public List<EmployeeDetailsDo> getAllEmployee() {
		
		try {
				
			List<EmployeeDetailsDo> employees = new ArrayList<EmployeeDetailsDo>();  
			employeeRepository.findAll().forEach(employees1 -> employees.add(employees1));  
			return employees;
		} catch (Exception e) {
			System.err.println("getAllEmployeeById error " + e.getMessage());
			return null;
		}
		
	}

	@Override
	public EmployeeDetailsDto getEmployeeById(String employeeId) {
		EmployeeDetailsDto responseDto = new EmployeeDetailsDto();
		try {
			EmployeeDetailsDo response = new EmployeeDetailsDo();
			response = employeeRepository.findById(employeeId).get();
			responseDto = employeeDao.exportDto(response);

		} catch (Exception e) {
			System.err.println("getEmployeeById error " + e.getMessage());
		}

		return responseDto;
	}

	@Override
	public String deleteEmployee(String employeeId) {
		String status = "Employee deletion Failure";
		try {
			employeeRepository.deleteById(employeeId);
			status = "Employee deleted Successfully";
		} catch (Exception e) {
			System.err.println("[Employee][deletion][error]" + e.getMessage());
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String createNewEmployee(EmployeeDetailsDto dto) {
		String status = "Employee Creation Failure";
		try {
			dto.setId(UUID.randomUUID().toString());
			dto.setEmploymentId(UUID.randomUUID().toString());
			employeeRepository.save(employeeDao.importDto(dto));
			status = "Employee Created Successfully";
		} catch (Exception e) {
			System.err.println("[Employee][create][error]" + e.getMessage());
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String updateEmployee(EmployeeDetailsDto dto) {
		String status = "Employee updatation Failure";
		try {
			employeeRepository.save(employeeDao.importDto(dto));
			status = "Employee updatated Successfully";
		} catch (Exception e) {
			System.err.println("[Employee][updatation][error]" + e.getMessage());
			e.printStackTrace();
		}
		return status;
	}
	
}
