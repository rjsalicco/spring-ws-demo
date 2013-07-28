package com.axiomaticit.service;

import java.util.Set;

import com.axiomaticit.model.Person;

public interface PersonService {

	public Set<Person> findPersons(String name);
}