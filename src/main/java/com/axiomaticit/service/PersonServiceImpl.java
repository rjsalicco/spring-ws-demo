package com.axiomaticit.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.axiomaticit.model.Person;

@Component("personService")
public class PersonServiceImpl implements PersonService {

	@Override
	public List<Person> findPersons(String name) {
		
		Person person1 = new Person();
		person1.setId(1);
		person1.setFirstName("RJ");
		person1.setLastName("Salicco");
		person1.setEmailAddress("rj.salicco@gmail.com");
		
		Person person2 = new Person();
		person2.setId(2);
		person2.setFirstName("Robert");
		person2.setLastName("Salicco");
		person2.setEmailAddress("rj.salicco@yahoo.com");
		
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(person1);
		personSet.add(person2);
		
		List<Person> personList = new ArrayList<Person>();
		personList.addAll(personSet);
		
		return personList;
	}
}