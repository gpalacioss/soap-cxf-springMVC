package com.web.service.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.web.service.component.WebServiceI;

@Configuration
public class ClientConfiguration {
	
	@Bean(name = "client")
    public Object generateProxy() {
        return proxyFactoryBean().create();
    }

    @Bean
    public JaxWsProxyFactoryBean proxyFactoryBean() {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(WebServiceI.class);
        proxyFactory.setAddress("http://localhost:8080/services/firt-application");
        return proxyFactory;
    }

}
