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
