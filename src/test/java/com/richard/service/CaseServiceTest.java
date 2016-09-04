package com.richard.service;

import java.util.Collection;

import javax.persistence.EntityExistsException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.richard.AbstractTest;
import com.richard.model.Case_;
import com.richard.service.CaseService;

//any testing of a destructive nature rollback after test
@Transactional
public class CaseServiceTest extends AbstractTest{

	@Autowired
	private CaseService service;
	
	//The Before annotation allows the method using it execute before the test, but only one of this annotation allowed per class
	@Before
	public void setUp(){
		//service.evictCache();//<<Did not create this yet
		
	}
	
	//The After annotation allows the method using it execute after the test, but only one of this annotation allowed per class
	@After
	public void tearDown(){
		//cleanUp After test method
	}
	
	@Test
	public void testFindAll(){
		Collection<Case_> list = service.findAll();
		
		Assert.assertNotNull("Failure - Expected not null",list);
		Assert.assertEquals("Expected 14 Default Values",14,list.size());
	}
	
	@Test
	public void testFindOne(){
		Long id = new Long(1);
		Case_ cs = service.findOne(id);
		Assert.assertNotNull("Failure - Expected not null",cs);
		Assert.assertEquals("Failure - Expected id attribute match", id, cs.getId());
	}
	
	//verifies the return is null when no matching greeting found
	@Test
	public void testFindOneNotFound(){
		Long id = Long.MAX_VALUE;
		Case_ cs = service.findOne(id);
		
		Assert.assertNull("Failure - Expected a null from a non-existant item",cs);
	}
	
	@Test
	public void testCreate(){
		Case_ cs = new Case_();
		cs.setSolnName("solnXX");
		Case_ createdCase = service.create(cs);
		
		Assert.assertNotNull("Failure - Expected Created Item return here",createdCase);
		Assert.assertNotNull("Failure - Expected Created Item Id here",createdCase.getId());
		Assert.assertEquals("Failure - Expected Created Item solnName value here","solnXX",createdCase.getSolnName());

		Collection<Case_> list = service.findAll();
		
		Assert.assertEquals("Failure - Expected Size Of Case List Now 15",15,list.size());
	}
	
	//This test tries to create by Id modification, which should fail
//	@Test
//	public void testCreateWithId(){
//		Exception e =null;
//		
//		Case_ cs = new Case_();
//		cs.setId(22L);
//		cs.setSolnName("solnXXX");
//		
//		try{
//			service.create(cs);
//		}catch(EntityExistsException ee){
//			e = ee;
//		}
//				
//		Assert.assertNotNull("Failure - Expected Exception",e);
//		Assert.assertTrue("Failure - Expected EntityExistsException",e instanceof EntityExistsException);
//	}
	
	//Test update works on solnName... Finding first item in Cases by id 1, and modifying solnName
	@Test
	public void testUpdate(){
		Long id = new Long(1);
		Case_ cs = service.findOne(id);
		Assert.assertNotNull("Failure - Expected not null",cs);
		
		String updatedSolnName = cs.getSolnName()+"test";
		cs.setSolnName(updatedSolnName);
		Case_ updatedCase = service.update(cs);
		Assert.assertNotNull("Failure - Expected update Case not to be null",updatedCase);
		Assert.assertEquals("Failure - Expected Id attribute to remain the same",id,updatedCase.getId());
		Assert.assertEquals("Failure - Expected updated solnName to match the value passed", updatedSolnName, updatedCase.getSolnName());
		
	}
	
	//Test all count mappings return the correct count
//	@Test
//	public void testCount(){
//		Long csCnt= service.getCount();
//		Assert.assertNotNull("Failure - Expected update Case not to be null",csCnt);
//		Collection<Case_> list = service.findAll();
//		Assert.assertEquals("Failure - Expected Id attribute to remain the same",list.size(),csCnt);
//	}
//	
	@Test
	public void testDelete(){
		Long id = new Long(1);
		Case_ cs = service.findOne(id);
		Assert.assertNotNull("Failure - Expected not null",cs);
		
		service.delete(id);
		Collection<Case_> list = service.findAll();
		Assert.assertEquals("Expected 14 Default Values",13,list.size());
		
		Case_ deletedCase = service.findOne(id);
		Assert.assertNull("Failure - Expected a null from a deleted item",deletedCase);
		
	}

}
