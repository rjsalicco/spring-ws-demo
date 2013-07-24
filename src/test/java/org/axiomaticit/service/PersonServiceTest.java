package org.axiomaticit.service;

import org.axiomaticit.service.PersonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations="classpath:spring-ws-test-context.xml")
public class PersonServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private PersonService personService;
	
	@Test
	public void testFindPersons() {
		personService.findPersons("test");
	}
}