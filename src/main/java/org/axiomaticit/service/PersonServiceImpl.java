package org.axiomaticit.service;

import java.util.HashSet;
import java.util.Set;

import org.axiomaticit.model.Person;
import org.springframework.stereotype.Component;

@Component("personService")
public class PersonServiceImpl implements PersonService {

	@Override
	public Set<Person> findPersons(String name) {
		
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
		
		Set<Person> personsSet = new HashSet<Person>();
		personsSet.add(person1);
		personsSet.add(person2);
		
		return personsSet;
	}
}