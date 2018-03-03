/**
 * Property of Richard McCormack, and part of a rework of 2013-14 college 'TimberSave'
 * project. This project was in conjunction with EU COST Action Group FP1101, via NUI
 * Galway... The original thesis' app was a native Android application, with PHP api
 * endpoints for AI. This is the Java SpringBoot api rewrite with Swagger api documen-
 * tation.
 * 
 * Below is the bean definition for db object for jpa entity
 * 
 * ***********Author: richard.mccormack6@hotmail.com*************
 **/

package com.richard.model;

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

	//Declare all Case variables, in DB order... NOTE: We're gonna use int here and in DB to limit penalisation on fractions!!!	
	private String case_solnUsed_Name;
	private Boolean case_isListedBuilding, case_isOccupiedBuilding, case_hasExposedArt;
	private Integer case_geoTempMax, case_geoTempMin, case_geoHumidityPercentage;
	private String case_structArea_cat, case_structArea_type;
	private Boolean case_structArea_isExposed;
	private String case_dmgComponent_name, case_dmgComponent_locn, case_dmgComponent_structPurp, case_dmgComponent_materialGrade;
	private Integer case_dmgComponent_csArea, case_dmgComponent_csSpan, case_dmgComponent_dmgPercentage;
	
	//constructor for bean
	public Case_() {
		
	}

	public Case_(Long id, String case_solnUsed_Name, Boolean case_isListedBuilding, Boolean case_isOccupiedBuilding,
			Boolean case_hasExposedArt, Integer case_geoTempMax, Integer case_geoTempMin,
			Integer case_geoHumidityPercentage, String case_structArea_cat, String case_structArea_type,
			Boolean case_structArea_isExposed, String case_dmgComponent_name, String case_dmgComponent_locn,
			String case_dmgComponent_structPurp, String case_dmgComponent_materialGrade,
			Integer case_dmgComponent_csArea, Integer case_dmgComponent_csSpan,
			Integer case_dmgComponent_dmgPercentage) {
		super();
		this.id = id;
		this.case_solnUsed_Name = case_solnUsed_Name;
		this.case_isListedBuilding = case_isListedBuilding;
		this.case_isOccupiedBuilding = case_isOccupiedBuilding;
		this.case_hasExposedArt = case_hasExposedArt;
		this.case_geoTempMax = case_geoTempMax;
		this.case_geoTempMin = case_geoTempMin;
		this.case_geoHumidityPercentage = case_geoHumidityPercentage;
		this.case_structArea_cat = case_structArea_cat;
		this.case_structArea_type = case_structArea_type;
		this.case_structArea_isExposed = case_structArea_isExposed;
		this.case_dmgComponent_name = case_dmgComponent_name;
		this.case_dmgComponent_locn = case_dmgComponent_locn;
		this.case_dmgComponent_structPurp = case_dmgComponent_structPurp;
		this.case_dmgComponent_materialGrade = case_dmgComponent_materialGrade;
		this.case_dmgComponent_csArea = case_dmgComponent_csArea;
		this.case_dmgComponent_csSpan = case_dmgComponent_csSpan;
		this.case_dmgComponent_dmgPercentage = case_dmgComponent_dmgPercentage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCase_solnUsed_Name() {
		return case_solnUsed_Name;
	}

	public void setCase_solnUsed_Name(String case_solnUsed_Name) {
		this.case_solnUsed_Name = case_solnUsed_Name;
	}

	public Boolean getCase_isListedBuilding() {
		return case_isListedBuilding;
	}

	public void setCase_isListedBuilding(Boolean case_isListedBuilding) {
		this.case_isListedBuilding = case_isListedBuilding;
	}

	public Boolean getCase_isOccupiedBuilding() {
		return case_isOccupiedBuilding;
	}

	public void setCase_isOccupiedBuilding(Boolean case_isOccupiedBuilding) {
		this.case_isOccupiedBuilding = case_isOccupiedBuilding;
	}

	public Boolean getCase_hasExposedArt() {
		return case_hasExposedArt;
	}

	public void setCase_hasExposedArt(Boolean case_hasExposedArt) {
		this.case_hasExposedArt = case_hasExposedArt;
	}

	public Integer getCase_geoTempMax() {
		return case_geoTempMax;
	}

	public void setCase_geoTempMax(Integer case_geoTempMax) {
		this.case_geoTempMax = case_geoTempMax;
	}

	public Integer getCase_geoTempMin() {
		return case_geoTempMin;
	}

	public void setCase_geoTempMin(Integer case_geoTempMin) {
		this.case_geoTempMin = case_geoTempMin;
	}

	public Integer getCase_geoHumidityPercentage() {
		return case_geoHumidityPercentage;
	}

	public void setCase_geoHumidityPercentage(Integer case_geoHumidityPercentage) {
		this.case_geoHumidityPercentage = case_geoHumidityPercentage;
	}

	public String getCase_structArea_cat() {
		return case_structArea_cat;
	}

	public void setCase_structArea_cat(String case_structArea_cat) {
		this.case_structArea_cat = case_structArea_cat;
	}

	public String getCase_structArea_type() {
		return case_structArea_type;
	}

	public void setCase_structArea_type(String case_structArea_type) {
		this.case_structArea_type = case_structArea_type;
	}

	public Boolean getCase_structArea_isExposed() {
		return case_structArea_isExposed;
	}

	public void setCase_structArea_isExposed(Boolean case_structArea_isExposed) {
		this.case_structArea_isExposed = case_structArea_isExposed;
	}

	public String getCase_dmgComponent_name() {
		return case_dmgComponent_name;
	}

	public void setCase_dmgComponent_name(String case_dmgComponent_name) {
		this.case_dmgComponent_name = case_dmgComponent_name;
	}

	public String getCase_dmgComponent_locn() {
		return case_dmgComponent_locn;
	}

	public void setCase_dmgComponent_locn(String case_dmgComponent_locn) {
		this.case_dmgComponent_locn = case_dmgComponent_locn;
	}

	public String getCase_dmgComponent_structPurp() {
		return case_dmgComponent_structPurp;
	}

	public void setCase_dmgComponent_structPurp(String case_dmgComponent_structPurp) {
		this.case_dmgComponent_structPurp = case_dmgComponent_structPurp;
	}

	public String getCase_dmgComponent_materialGrade() {
		return case_dmgComponent_materialGrade;
	}

	public void setCase_dmgComponent_materialGrade(String case_dmgComponent_materialGrade) {
		this.case_dmgComponent_materialGrade = case_dmgComponent_materialGrade;
	}

	public Integer getCase_dmgComponent_csArea() {
		return case_dmgComponent_csArea;
	}

	public void setCase_dmgComponent_csArea(Integer case_dmgComponent_csArea) {
		this.case_dmgComponent_csArea = case_dmgComponent_csArea;
	}

	public Integer getCase_dmgComponent_csSpan() {
		return case_dmgComponent_csSpan;
	}

	public void setCase_dmgComponent_csSpan(Integer case_dmgComponent_csSpan) {
		this.case_dmgComponent_csSpan = case_dmgComponent_csSpan;
	}

	public Integer getCase_dmgComponent_dmgPercentage() {
		return case_dmgComponent_dmgPercentage;
	}

	public void setCase_dmgComponent_dmgPercentage(Integer case_dmgComponent_dmgPercentage) {
		this.case_dmgComponent_dmgPercentage = case_dmgComponent_dmgPercentage;
	}
	
}
