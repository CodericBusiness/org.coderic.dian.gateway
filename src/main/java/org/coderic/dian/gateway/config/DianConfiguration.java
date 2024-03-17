package org.coderic.dian.gateway.config;

import org.coderic.dian.gateway.clients.DianClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class DianConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("org.coderic.ws.dian.wsdl");
        return marshaller;
    }

    @Bean
    public DianClient dianClient(Jaxb2Marshaller marshaller) {
        DianClient client = new DianClient();
        client.setDefaultUri("https://vpfe-hab.dian.gov.co/WcfDianCustomerServices.svc");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
    
}
