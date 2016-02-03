package com.smilesmile1973.bo;

import java.util.List;

import com.smilesmile1973.dto.PersonDTO;

public interface PersonBo {
	int save(PersonDTO personDTO);
	PersonDTO readById(int  id);
	List<PersonDTO> getAll();
}
