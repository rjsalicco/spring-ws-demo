//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.01 at 04:45:03 PM EST 
//


package com.axiomaticit.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.axiomaticit.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.axiomaticit.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindPersonsResponse }
     * 
     */
    public FindPersonsResponse createFindPersonsResponse() {
        return new FindPersonsResponse();
    }

    /**
     * Create an instance of {@link Persons }
     * 
     */
    public Persons createPersons() {
        return new Persons();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link FindPersonsRequest }
     * 
     */
    public FindPersonsRequest createFindPersonsRequest() {
        return new FindPersonsRequest();
    }

}
