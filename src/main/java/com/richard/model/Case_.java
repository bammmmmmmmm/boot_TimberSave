package com.richard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Case_ {
	
	//Both of these are poor for future expansion of categories 
/*	enum DamageLocn{SPAN,JOINT,BOTH}
	enum DamageCat{BIOTIC,ABIOTIC,MECHANICAL}*/

	@Id //Denotes that this isPrimary Key
	@GeneratedValue //Declares that values for this attribute created by underlying db
	private Long id;
	
	private String solnName;
	
/*	private int temp[]=new int[2];
	private int humidityAv;
	private int roofType;
	private int damagePercent;
	private List<String> issues;
	private DamageLocn damageLocn;
	private Map<DamageCat,String> damageType;///Maybe do map-arraylist inside
	private Map<String,Boolean> archConditions;
	private Map<String, Integer> archScores;
	private Map<String, Integer> carbScores;
	private Map<String, Integer> costScores;*/
	
	//constructor for bean
	public Case_() {
		
	}

	//other constructor for fully initialised model
	public Case_(Long id, String solnName) {
		super();
		this.id = id;
		this.solnName = solnName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSolnName() {
		return solnName;
	}

	public void setSolnName(String solnName) {
		this.solnName = solnName;
	}
	
	

}
