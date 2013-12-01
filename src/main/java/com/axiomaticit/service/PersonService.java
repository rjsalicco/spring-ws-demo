package com.axiomaticit.service;

import java.util.List;

import com.axiomaticit.model.Person;

public interface PersonService {

	public List<Person> findPersons(String name);
}