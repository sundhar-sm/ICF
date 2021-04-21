package com.oneapp.icf.assignment.dao;

import org.springframework.data.repository.CrudRepository;

import com.oneapp.icf.assignment.entity.DependentEmployeeDo;

//repository that extends CrudRepository  
public interface DependentEmployeeRepository extends CrudRepository<DependentEmployeeDo, String> {
	
	
}