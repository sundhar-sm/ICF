package com.oneapp.icf.assignment.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oneapp.icf.assignment.dto.EmployeeDetailsDto;
import com.oneapp.icf.assignment.entity.EmployeeDetailsDo;
import com.oneapp.icf.assignment.services.EmployeeService;

@RestController
@ComponentScan("oneapp.icf")
@RequestMapping(value = "/icf/employee", produces = "application/json")
public class EducationQualificationRest {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET)
	public List<EmployeeDetailsDo> getAllEmployee() {

		List<EmployeeDetailsDo> response = null;
		try {
			response = employeeService.getAllEmployee();
		} catch (Exception e) {

			System.err.println("getAllEmployee error : " + e);
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "/getEmployeeById", method = RequestMethod.GET)
	public EmployeeDetailsDto getEmployeeById(
			@RequestParam(value = "employeeId", required = true) String employeeId) {
		System.err.println("employeeId : " + employeeId);
		EmployeeDetailsDto response = null;
		try {
			response = employeeService.getEmployeeById(employeeId);
		} catch (Exception e) {

			System.err.println("getEmployeeById error : " + e);
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public String deleteEmployee(
			@RequestParam(value = "employeeId", required = true) String employeeId) {
		System.err.println("deleteEmployee employeeId : " + employeeId);
		String response = null;
		try {
			response = employeeService.deleteEmployee(employeeId);
		} catch (Exception e) {

			System.err.println("deleteEmployee error : " + e);
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "/createNewEmployee", method = RequestMethod.POST)
	public String createNewEmployee(@RequestBody EmployeeDetailsDto employeeDetailsDto) {
		System.err.println("employeeDetailsDto : " + employeeDetailsDto);
		String response = "";
		try {
			response = employeeService.createNewEmployee(employeeDetailsDto);
		} catch (Exception e) {

			System.err.println("createNewEmployee error : " + e);
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public String updateEmployee(@RequestBody EmployeeDetailsDto employeeDetailsDto) {
		System.err.println("employeeDetailsDto : " + employeeDetailsDto);
		String response = "";
		try {
			response = employeeService.updateEmployee(employeeDetailsDto);
		} catch (Exception e) {

			System.err.println("updateEmployee error : " + e);
			e.printStackTrace();
		}

		return response;
	}

}
