package com.axiomaticit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.axiomaticit.model.Person;

@Component("personService")
public class PersonServiceImpl implements PersonService {

	@Override
	public List<Person> findPersons(String name) {
		
		List<Person> personList = new ArrayList<Person>();
		return personList;
	}
}