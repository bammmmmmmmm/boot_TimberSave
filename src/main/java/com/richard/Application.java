/**
 * Property of Richard McCormack, and part of a rework of 2013-14 college 'TimberSave'
 * project. This project was in conjunction with EU COST Action Group FP1101, via NUI
 * Galway... The original thesis' app was a native Android application, with PHP api
 * endpoints for AI. This is the Java SpringBoot api rewrite with Swagger api documen-
 * tation.
 * 
 * Below is the entry point for the Spring Boot application
 * 
 * ***********Author: richard.mccormack6@hotmail.com*************
 **/

package com.richard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *Spring Boot main Application
 * @author: Richard
 */
@SpringBootApplication
public class Application
{
    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(Application.class, args);
    }
}
