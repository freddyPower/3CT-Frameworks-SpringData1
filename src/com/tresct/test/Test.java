package com.tresct.test;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tresct.domain.Tramite;
import com.tresct.service.TramiteService;

public class Test {
	public static void main(String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		TramiteService tramiteService = context.getBean(TramiteService.class);		
		Timestamp time = new Timestamp(new Date().getTime());
		
		System.out.println(tramiteService.exists(1));
		
		((ClassPathXmlApplicationContext)context).close();	
	}
	
	//Metodos de prueba de los servicios
	public static void save(Timestamp time , TramiteService tService) {		
		Tramite tramite = new Tramite("Construccion" , time);
		tService.save(tramite);
	}
	
	
}
