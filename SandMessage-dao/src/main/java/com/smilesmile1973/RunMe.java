package com.smilesmile1973;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smilesmile1973.bo.PersonBo;
import com.smilesmile1973.dto.PersonDTO;

public class RunMe {
	public static void main(String args[]){
		ApplicationContext appContext =  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		PersonBo personBO = (PersonBo) appContext.getBean("personBo");
		PersonDTO result = personBO.readById(1);
		System.out.println(result.getEmail());
	}
}
