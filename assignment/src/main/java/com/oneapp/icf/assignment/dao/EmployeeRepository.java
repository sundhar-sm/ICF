package com.oneapp.icf.assignment.dao;

import org.springframework.data.repository.CrudRepository;

import com.oneapp.icf.assignment.entity.EmployeeDetailsDo;

//repository that extends CrudRepository  
public interface EmployeeRepository extends CrudRepository<EmployeeDetailsDo, String> {
	
	
}