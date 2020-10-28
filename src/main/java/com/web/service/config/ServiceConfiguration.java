package com.web.service.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.http.HttpDestinationFactory;
import org.apache.cxf.transport.servlet.ServletDestinationFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.web.service.component.WebServiceImpl;

@Configuration
public class ServiceConfiguration {

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		
		SpringBus springBus = new SpringBus();
		ServletDestinationFactory destinationFactory = new ServletDestinationFactory();
		springBus.setExtension(destinationFactory, HttpDestinationFactory.class);
		return springBus;
	}

	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), new WebServiceImpl());
		endpoint.publish("/firt-application");
		return endpoint;
	}

}
