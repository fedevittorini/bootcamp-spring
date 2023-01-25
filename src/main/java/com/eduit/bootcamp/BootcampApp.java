package com.eduit.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import com.eduit.bootcamp.conf.AppConfig;

@Import(AppConfig.class)
public class BootcampApp {


	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BootcampApp.class);
	}
	
	
	public BootcampApp() {
	}
	
}
