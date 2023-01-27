package com.eduit.bootcamp.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.eduit.bootcamp.entity.Clientes;


public class ClientService {

	private List<String> clients;
	
	private String host;
	
	/**
	 * 
	 * @param theHost
	 * @param theClientesList
	 */
	public ClientService(final String theHost, final List<String> theClientesList) {
		host = theHost;
		clients = theClientesList;
	}

	public List<String> getAllClients() {
		return clients;
	}
	
	
	public String getClients(final String name) {
		List<String> pc = clients.stream()
				.filter((o) -> name.equals(o))
				.collect(Collectors.toList());
		
		return pc.get(0);
	}
}
