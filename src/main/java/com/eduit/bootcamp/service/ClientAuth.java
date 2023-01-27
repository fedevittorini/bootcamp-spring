package com.eduit.bootcamp.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ClientAuth {

	private ClientService clientService;
	
	private String authHost;
	
	public ClientAuth(@Qualifier("clientServiceMain") ClientService theClientService, 
			@Value("${auth.host:}") final String theHost) {
		clientService = theClientService;
		authHost = theHost;
	}
	
	
	public boolean authenticate(final String theName) {
		String client = clientService.getClients(theName);
		return (client != null && client != "");
	}
	
	
	

}
