package com.smilesmile1973.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.smilesmile1973.dao.PersonDao;
import com.smilesmile1973.entity.Person;
import com.smilesmile1973.util.CustomHibernateDaoSupport;

@Repository("stockDao")
public class PersonDaoImpl extends CustomHibernateDaoSupport implements PersonDao{

	public void save(Person person) {
		getHibernateTemplate().save(person);
		
	}

	public Person readById(Person person) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Person.class);
		criteria.add(Restrictions.eqOrIsNull("id",person.getId()));
		List<Person> persons = (List<Person>) getHibernateTemplate().findByCriteria(criteria);
		return persons.get(0);
		
	}

	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
