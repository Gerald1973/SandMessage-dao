package com.smilesmile1973.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smilesmile1973.bo.PersonBo;


public enum ServiceUtils {
	INSTANCE;
	
	private ApplicationContext cxt; 
	
	public PersonBo getPersonBo(){
		return (PersonBo) cxt.getBean("personBo");
	}
	
	private ServiceUtils(){
		cxt = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	}
}
