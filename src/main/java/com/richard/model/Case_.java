package com.richard.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Case_ {
	
	//Both of these are poor for future expansion of categories 
//	enum DamageLocn{SPAN,JOInteger,BOTH}//TODO:Move to separate table!!!
//	enum DamageCat{BIOTIC,ABIOTIC,MECHANICAL}//TODO:Move to separate table!!!

	@Id //Denotes that this isPrimary Key
	@GeneratedValue //Declares that values for this attribute created by underlying db
	private Long id;
	private String solnName;
	
	private Integer tempMax;
	private Integer tempMin;	
	private Integer humidityAv;
	private Integer roofType;//TOTO:This should probably come in string form
	private Integer damagePercent;
	
	//TODO: Figure out collections mapping!!!!!!!!!
//	private List<String> issues;
//	private DamageLocn damageLocn;
//	private Map<DamageCat,String> damageType;///Maybe do map-arraylist inside
//	private Map<String,Boolean> archConditions;
//	private Map<String, Integereger> archScores;
//	private Map<String, Integereger> carbScores;
//	private Map<String, Integereger> costScores;
	
	//constructor for bean
	public Case_() {
		
	}

	//other constructor for fully initialised model
	public Case_(Long id, String solnName, Integer tempMax, Integer tempMin, Integer humidityAv, Integer roofType, Integer damagePercent) {
		super();
		this.id = id;
		this.solnName = solnName;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		this.humidityAv = humidityAv;
		this.roofType = roofType;
		this.damagePercent = damagePercent;
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
	

	public Integer getTempMax() {
		return tempMax;
	}

	public void setTempMax(Integer tempMax) {
		this.tempMax = tempMax;
	}

	public Integer getTempMin() {
		return tempMin;
	}

	public void setTempMin(Integer tempMin) {
		this.tempMin = tempMin;
	}

	public Integer getHumidityAv() {
		return humidityAv;
	}

	public void setHumidityAv(Integer humidityAv) {
		this.humidityAv = humidityAv;
	}

	public Integer getRoofType() {
		return roofType;
	}

	public void setRoofType(Integer roofType) {
		this.roofType = roofType;
	}

	public Integer getDamagePercent() {
		return damagePercent;
	}

	public void setDamagePercent(Integer damagePercent) {
		this.damagePercent = damagePercent;
	}

}
