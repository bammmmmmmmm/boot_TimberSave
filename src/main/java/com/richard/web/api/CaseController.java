package com.richard.web.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.richard.model.Case_;
import com.richard.service.CaseService;

@RestController //<<convert return methods into json or xml responses
public class CaseController {
	
	//Create Instance of CaseService
	@Autowired
	private CaseService caseService;
	
	//MAPPINGS
	//api_Get all Cases
	@RequestMapping(value="/api/cases/*",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Case_>> getAllCases(){
		
		Collection<Case_> cases = caseService.findAll();
		
		return new ResponseEntity<Collection<Case_>>(cases,HttpStatus.OK);		
	}
	
	//api_Get count of all Cases
	@RequestMapping(value="/api/cases/count",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Long> getCasesCount(){
		
		Long casesTotal = caseService.getCount();
		
		return new ResponseEntity<Long>(casesTotal,HttpStatus.OK);		
	}
	
	//api_Get Case by case_id
	@RequestMapping(value="/api/cases/{id}",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Case_> getCaseById(@PathVariable("id") Long id){
		
		Case_ cs = caseService.findOne(id);
		if(cs == null){
			return new ResponseEntity<Case_>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Case_>(cs,HttpStatus.OK);		
	}
	
	//api_Update Case by case_id... Note: Must have the id in the url mapping AND the full JSON object too to succeed. 
	@RequestMapping(value="/api/cases/{id}",
			method=RequestMethod.PUT,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Case_> updateCaseById(@RequestBody Case_ cs){
		
		Case_ updatedCs = caseService.update(cs);
		if(updatedCs == null){
			return new ResponseEntity<Case_>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Case_>(updatedCs,HttpStatus.OK);		
	}	
	
	//api_Create new Case... NOTE: When testing this, client must set in header Content-Type as 'application/json'
	@RequestMapping(value="/api/cases",
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Case_> createCase(@RequestBody Case_ cs){//converted implicitly from json to java case object if fields match
		
		Case_ savedCase=caseService.create(cs);
		
		return new ResponseEntity<Case_>(savedCase,HttpStatus.CREATED);		
	}
	
	//api_Delete Case byId... Note: Must have the id in the url mapping AND the full JSON object too to succeed.
	@RequestMapping(value="/api/cases/{id}",
			method=RequestMethod.DELETE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Case_> deleteCase(@PathVariable("id") Long id, @RequestBody Case_ cs){//converted implicitly from json to java case object if fields match
		
		caseService.delete(id);
		
		return new ResponseEntity<Case_>(HttpStatus.NO_CONTENT);		
	}
}
