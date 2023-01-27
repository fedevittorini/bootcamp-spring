package com.eduit.bootcamp.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.eduit.bootcamp.service.ClientService;

import edu.emory.mathcs.backport.java.util.Arrays;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

	@Autowired
    private ApplicationContext appContext;
	
	@Autowired
	private Environment env;

	
	@Bean(name = "clientServiceMain")
	public ClientService getClientServiceMain(@Value("${clientService.amazon.host}") String theHost, 
			@Value("${clientService.amazon.clients:A,B,C,D}") String[] theClientList) {
		System.out.println("Bean: clientServiceMain");
		return new ClientService(theHost, Arrays.asList(theClientList));
	}
	
	@Bean(name = "clientServiceSecondary")
	public ClientService getClientServiceSecondary(@Value("${clientService.azure.host}") String theHost, 
			@Value("${clientService.azure.clients:A,B,C,D}") String[] theClientList) {
		System.out.println("Bean: clientServiceSecondary");
		return new ClientService(theHost, Arrays.asList(theClientList));
	}

}
