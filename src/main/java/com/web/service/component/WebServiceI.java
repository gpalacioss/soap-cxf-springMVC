package com.web.service.component;

import javax.jws.WebService;

import com.web.service.models.Persona;

@WebService
public interface WebServiceI {
	
	String hello(String name);
	
	String register(Persona persona);
}
