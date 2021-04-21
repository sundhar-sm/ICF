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
import com.oneapp.icf.assignment.services.DependentEmployeeService;

@RestController
@ComponentScan("oneapp.icf")
@RequestMapping(value = "/icf/dependentEmployee", produces = "application/json")
public class DependentEmployeeRest {

	@Autowired
	DependentEmployeeService dependentEmployeeService;

	@RequestMapping(value = "/getAllDependentEmployee", method = RequestMethod.GET)
	public List<EmployeeDetailsDo> getAllDependentEmployee() {

		List<EmployeeDetailsDo> response = null;
		try {
			response = dependentEmployeeService.getAllDependentEmployee();
		} catch (Exception e) {

			System.err.println("getAllDependentEmployee error : " + e);
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "/getDependentEmployeeById", method = RequestMethod.GET)
	public EmployeeDetailsDto getDependentEmployeeById(
			@RequestParam(value = "employeeId", required = true) String employeeId) {
		System.err.println("employeeId : " + employeeId);
		EmployeeDetailsDto response = null;
		try {
			response = dependentEmployeeService.getDependentEmployeeById(employeeId);
		} catch (Exception e) {

			System.err.println("getDependentEmployeeById error : " + e);
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "/deleteDependentEmployee", method = RequestMethod.GET)
	public String deleteDependentEmployee(
			@RequestParam(value = "employeeId", required = true) String employeeId) {
		System.err.println("deleteDependentEmployee employeeId : " + employeeId);
		String response = null;
		try {
			response = dependentEmployeeService.deleteDependentEmployee(employeeId);
		} catch (Exception e) {

			System.err.println("deleteDependentEmployee error : " + e);
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "/createNewDependentEmployee", method = RequestMethod.POST)
	public String createNewDependentEmployee(@RequestBody EmployeeDetailsDto employeeDetailsDto) {
		System.err.println("employeeDetailsDto : " + employeeDetailsDto);
		String response = "";
		try {
			response = dependentEmployeeService.createNewDependentEmployee(employeeDetailsDto);
		} catch (Exception e) {

			System.err.println("createNewDependentEmployee error : " + e);
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "/updateDependentEmployee", method = RequestMethod.POST)
	public String updateDependentEmployee(@RequestBody EmployeeDetailsDto employeeDetailsDto) {
		System.err.println("employeeDetailsDto : " + employeeDetailsDto);
		String response = "";
		try {
			response = dependentEmployeeService.updateDependentEmployee(employeeDetailsDto);
		} catch (Exception e) {

			System.err.println("updateDependentEmployee error : " + e);
			e.printStackTrace();
		}

		return response;
	}

}
