package com.smilesmile1973.dao;

import java.util.List;

import com.smilesmile1973.entity.Person;

public interface PersonDao {
	void save(Person person);
	Person readById(Person person);
	List<Person> getAll();
}
