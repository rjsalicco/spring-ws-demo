package org.axiomaticit.service;

import java.util.Set;

import org.axiomaticit.model.Person;

public interface PersonService {

	public Set<Person> findPersons(String name);
}