package org.axiomaticit.endpoint;

import org.axiomaticit.model.FindPersonsRequest;
import org.axiomaticit.model.FindPersonsResponse;
import org.axiomaticit.model.Person;
import org.axiomaticit.service.MarshallingPersonService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PersonEndpoint implements MarshallingPersonService {
    
    /**
     * Gets person list.
     */
    @PayloadRoot(localPart=GET_PERSONS_REQUEST, namespace=NAMESPACE)
    public @ResponsePayload FindPersonsResponse findPersons(@RequestPayload FindPersonsRequest request) {
    	String name = request.getName();
    	System.out.println(name);
    	Person person = new Person();
    	person.setFirstName(name);
    	person.setLastName("Salicco");
    	FindPersonsResponse personResponse = new FindPersonsResponse();
    	personResponse.getPersons().add(person);
        return personResponse;        
    }
}