##spring-ws-demo
A simple demo of a Web service built using Spring WS.

####Getting Started

1) Run the demo application using Maven with: mvn jetty:run

2) Browse to the following URL to see the dynamic WSDL: http://localhost:8080/spring-ws-demo/person.wsdl

3) Basic Authentication/Authorization over HTTP (not secure) has been added and can be configured in the web.xml file. The username, password and roles can be changed in /src/test/resource/realm.properties. The configuration for Jetty is in the pom.xml file. This is just an example of how developers can test with security in a local environment.
For more information on Spring WS, visit [springsource.org].

[springsource.org]:http://springsource.org