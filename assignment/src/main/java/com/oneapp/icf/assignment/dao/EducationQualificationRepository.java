package com.oneapp.icf.assignment.dao;

import org.springframework.data.repository.CrudRepository;

import com.oneapp.icf.assignment.entity.EducationQualificationDo;

//repository that extends CrudRepository  
public interface EducationQualificationRepository extends CrudRepository<EducationQualificationDo, String> {
	
	
}