/**
 * Property of Richard McCormack, and part of a rework of 2013-14 college 'TimberSave'
 * project. This project was in conjunction with EU COST Action Group FP1101, via NUI
 * Galway... The original thesis' app was a native Android application, with PHP api
 * endpoints for AI. This is the Java SpringBoot api rewrite with Swagger api documen-
 * tation.
 * 
 * Below is the jpa stub for object mapping to any db
 * 
 * ***********Author: richard.mccormack6@hotmail.com*************
 **/

package com.richard.data_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richard.model.Case_;


@Repository
public interface CaseRepository extends JpaRepository<Case_, Long> {

}
