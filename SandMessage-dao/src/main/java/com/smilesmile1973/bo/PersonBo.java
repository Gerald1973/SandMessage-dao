package com.smilesmile1973.bo;

import java.util.List;

import com.smilesmile1973.dto.PersonDTO;
import com.smilesmile1973.entity.Person;

public interface PersonBo {
	void save(Person person);
	PersonDTO readById(int  id);
	List<PersonDTO> getAll();
}
