package com.eduit.bootcamp.service;

import org.springframework.stereotype.Service;

@Service
public class ClientAuth {

	private ClientService clientService;
	
	public ClientAuth(ClientService theClientService) {
		clientService = theClientService;
	}
	
	
	public boolean authenticate(final String theName) {
		String client = clientService.getClients(theName);
		return (client != null);
	}
	
	
	

}
