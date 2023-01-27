package com.eduit.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.eduit.bootcamp.conf.AppConfig;
import com.eduit.bootcamp.service.ClientAuth;
import com.eduit.bootcamp.service.ClientService;

@Import(AppConfig.class)
@ComponentScan
public class BootcampApp {


	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BootcampApp.class);
		ClientService csm = (ClientService) ctx.getBean("clientServiceMain");
		csm.getAllClients();
		
		ClientService css = ctx.getBean("clientServiceSecondary", ClientService.class);
		css.getAllClients();
		
		ClientAuth auth = ctx.getBean(ClientAuth.class);
		auth.authenticate("A");
		System.out.println(auth.toString());
	}
	
	public BootcampApp() {
		
	}
	
}
