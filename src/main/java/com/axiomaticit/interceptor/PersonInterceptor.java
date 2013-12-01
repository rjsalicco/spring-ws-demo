package com.axiomaticit.interceptor;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;

public class PersonInterceptor implements EndpointInterceptor {

	private static final Logger LOGGER = Logger.getLogger(PersonInterceptor.class.getName());
	
	public void afterCompletion(MessageContext arg0, Object arg1, Exception arg2) throws Exception {
		LOGGER.log(Level.INFO, ">>> It's Alive! <<<");
	}

	public boolean handleFault(MessageContext arg0, Object arg1) throws Exception {
		return true;
	}

	public boolean handleRequest(MessageContext arg0, Object arg1) throws Exception {
		return true;
	}

	public boolean handleResponse(MessageContext arg0, Object arg1) throws Exception {
		return true;
	}
}