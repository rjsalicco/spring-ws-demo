package com.axiomaticit.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.axiomaticit.service.PersonService;

@ContextConfiguration(locations="classpath:spring-ws-test-context.xml")
public class PersonServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private PersonService personService;
	
	@Test
	public void testFindPersons() {
		personService.findPersons("test");
	}
}