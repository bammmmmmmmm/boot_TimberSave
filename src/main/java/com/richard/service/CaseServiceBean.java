package com.richard.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richard.data_repository.CaseRepository;
import com.richard.model.Case_;


@Service
public class CaseServiceBean implements CaseService{
	
//	//START
//	//Temp: Until we connect to a DB use the seven lines below
//	private static Long nextId;
//	private static Map<Long, Case> caseMap;
//		
//	//Temp: Now lets have a method to save some autogen Cases
//	private static Case save(Case cs){
//		//for first element in caseMap
//		if(caseMap ==null){
//			caseMap = new HashMap<Long, Case>();
//			nextId = Long.ONE;
//		}
//		
//		//Existing case to update... Here we check if object already has an id, if so we just want to retrieve it by id, delete and replace with same id but new object	
//		if(cs.getId()!=null){
//			Case caseToMod = caseMap.get(cs.getId());
//			if(caseToMod==null){//To me this logic block makes no sense
//				return null;
//			}
//			caseMap.remove(cs.getId());
//			caseMap.put(cs.getId(), cs);
//			return cs;
//		}
//		
//		cs.setId(nextId);
//		nextId = nextId.add(Long.ONE);
//		caseMap.put(cs.getId(), cs);
//		return cs;
//	}
//	
//	//Temp: delete a Case from caseMap
//	private static boolean delete(Long id){
//		Case caseForDeletion = caseMap.remove(id);
//		if(caseForDeletion == null){
//			return false;
//		}
//		return true;
//	}
//	
//	//Temp: initialise Map of cases with above spec
//	static {
//		Case cs1 = new Case();
//		cs1.setSolnName("Soln1");
//		save(cs1);
//		
//		Case cs2 = new Case();
//		cs2.setSolnName("Soln7");
//		save(cs2);
//	}
//	//END
	
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
