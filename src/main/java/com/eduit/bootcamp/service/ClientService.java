package com.eduit.bootcamp.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


public class ClientService {

	private final List<String> clients = Arrays.asList("A","B","C","D");
	
	public ClientService() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getAllClients() {
		return clients;
	}
	
	
	public String getClients(final String name) {
		List<String> pc = clients.stream().filter((o) -> o.equals(name)).collect(Collectors.toList());
		return pc.get(0);
	}
}
