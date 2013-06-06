package org.axiomaticit.service;

import org.axiomaticit.model.FindPersonsRequest;
import org.axiomaticit.model.FindPersonsResponse;

public interface MarshallingPersonService {
    
    public final static String NAMESPACE = "http://www.axiomaticit.org/model";
    public final static String GET_PERSONS_REQUEST = "findPersonsRequest";

    /**
     * Gets person list.
     */
    public FindPersonsResponse findPersons(FindPersonsRequest request);
}
