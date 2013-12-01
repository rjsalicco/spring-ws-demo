package com.axiomaticit.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.axiomaticit.model.FindPersonsRequest;
import com.axiomaticit.model.FindPersonsResponse;
import com.axiomaticit.model.Person;
import com.axiomaticit.model.Persons;
import com.axiomaticit.service.PersonService;

@Endpoint
public class PersonEndpoint {
    
	@Autowired
    private PersonService personService;
	
	@PayloadRoot(localPart="findPersonsRequest", namespace="http://www.axiomaticit.com/model")
    public @ResponsePayload FindPersonsResponse findPersons(@RequestPayload FindPersonsRequest request) {
		
		FindPersonsResponse findPersonsResponse = new FindPersonsResponse();
		Persons persons = new Persons();
		
		String name = request.getName();
		
		List<Person> personsList = personService.findPersons(name);

		persons.getPerson().addAll(personsList);
		findPersonsResponse.setPersons(persons);
		
		return findPersonsResponse;
    }
	
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}