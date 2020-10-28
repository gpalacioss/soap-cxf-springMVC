package com.web.service.component;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

import com.web.service.models.Persona;

@WebService(endpointInterface  = "com.web.service.component.WebServiceI")
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class WebServiceImpl implements WebServiceI {

	@Override
	public String hello(String name) {
		
		return "Hola :" + name;
	}

	@Override
	public String register(Persona persona) {
		
		return persona.getName() + "esto llego";
	}

}
