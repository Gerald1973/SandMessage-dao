package com.smilesmile1973.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smilesmile1973.bo.PersonBo;
import com.smilesmile1973.dao.PersonDao;
import com.smilesmile1973.dto.PersonDTO;
import com.smilesmile1973.entity.Person;

@Service("personBo")
public class PersonBoImpl implements PersonBo {
	
	@Autowired
	PersonDao personDao;
	
	public void save(Person person) {
		// TODO Auto-generated method stub

	}

	public PersonDTO readById(int id) {
		Person person = new Person();
		person.setId(id);
		PersonDTO personDTO = new PersonDTO();
		person = getPersonDao().readById(person);
		personDTO.setEmail(person.getEmail());
		personDTO.setFirstName(person.getFirstName());
		personDTO.setId(person.getId());
		personDTO.setLastName(person.getLastName());
		personDTO.setNickname(person.getNickname());
		return personDTO;
	}

	public List<PersonDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

}
