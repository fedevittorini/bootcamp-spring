package com.eduit.bootcamp.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.eduit.bootcamp.service.ClientAuth;
import com.eduit.bootcamp.service.ClientService;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

	@Autowired
    private ApplicationContext appContext;
	
	@Autowired
	private Environment env;
	
	@Bean
	public ClientAuth getClientAuth(ClientService clientService) {
		System.out.println("Client auth");
		return new ClientAuth(clientService);
	}
	
	@Bean
	public ClientService getClientService(@Value("${bootcamp.prop}") String theProp) {
		System.out.println("Client srv");
		return new ClientService();
	}
	


}
