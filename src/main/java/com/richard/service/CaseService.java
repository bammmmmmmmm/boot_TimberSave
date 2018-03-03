/**
 * Property of Richard McCormack, and part of a rework of 2013-14 college 'TimberSave'
 * project. This project was in conjunction with EU COST Action Group FP1101, via NUI
 * Galway... The original thesis' app was a native Android application, with PHP api
 * endpoints for AI. This is the Java SpringBoot api rewrite with Swagger api documen-
 * tation.
 * 
 * Below is the db interface for the api services to call
 * 
 * ***********Author: richard.mccormack6@hotmail.com*************
 **/

package com.richard.service;

import java.util.Collection;

import com.richard.model.Case_;


public interface CaseService {

	Collection<Case_> findAll();
	
	Long getCount();
	
	Case_ findOne(Long id);
	
	Case_ create(Case_ cs);
	
	Case_ update(Case_ cs);
	
	void delete(Long id);
	
}
