/**
 * Property of Richard McCormack, and part of a rework of 2013-14 college 'TimberSave'
 * project. This project was in conjunction with EU COST Action Group FP1101, via NUI
 * Galway... The original thesis' app was a native Android application, with PHP api
 * endpoints for AI. This is the Java SpringBoot api rewrite with Swagger api documen-
 * tation.
 * 
 * Below is the implementation of CaseService interface for the api services to call.
 * This is autowired to CaseController
 * 
 * ***********Author: richard.mccormack6@hotmail.com*************
 **/

package com.richard.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richard.data_repository.CaseRepository;
import com.richard.model.Case_;


@Service
public class CaseServiceBean implements CaseService{
	
	@Autowired
	private CaseRepository caseRepository;

	@Override
	public Collection<Case_> findAll() {
		Collection<Case_> cases = caseRepository.findAll();
		return cases;
	}

	@Override
	public Long getCount() {
		Long casesTotal = Long.valueOf(caseRepository.count());
		return casesTotal;
	}

	@Override
	public Case_ findOne(Long id) {
		Case_ cs = caseRepository.findOne(id);
		return cs;
	}
	
	@Override
	public Case_ create(Case_ cs) {
		//must validate id isnt already in use, so cannot create
		if (cs.getId() != null){
			return null;
		}
		Case_ savedCase=caseRepository.save(cs);
		return savedCase;
	}
	
	@Override
	public Case_ update(Case_ cs) {
		Case_ csPersisted = findOne(cs.getId());
		//must validate id exists
		if (csPersisted == null){
			//Doesn't exist, so cannot create update
			return null;
		} 	
		Case_ updatedCs = caseRepository.save(cs);
		return updatedCs;
	}



	@Override
	public void delete(Long id) {
		caseRepository.delete(id);
		
	}

}
