package org.axiomaticit.endpoint;

import java.util.List;
import java.util.Set;

import org.axiomaticit.model.FindPersonsRequest;
import org.axiomaticit.model.FindPersonsResponse;
import org.axiomaticit.model.Person;
import org.axiomaticit.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PersonEndpoint {
    
	@Autowired
    private PersonService personService;
	
	@PayloadRoot(localPart="findPersonsRequest", namespace="http://www.axiomaticit.org/model")
    public @ResponsePayload FindPersonsResponse findPersons(@RequestPayload FindPersonsRequest request) {
		String name = request.getName();
		
		Set<Person> personsSet = personService.findPersons(name);
		
		FindPersonsResponse findPersonsResponse = new FindPersonsResponse();
		List<Person> personsList = findPersonsResponse.getPersons();
		
		for(Person person : personsSet) {
			personsList.add(person);
		}
		
		return findPersonsResponse;
    }
	
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}