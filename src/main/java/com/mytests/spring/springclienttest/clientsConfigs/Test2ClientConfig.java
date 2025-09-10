package com.mytests.spring.springclienttest.clientsConfigs;

import com.mytests.spring.springclienttest.clients1.Test2Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
class Test2ClientConfig {

    @Bean
    public Test2Client test2Client() {
        RestClient restClient = RestClient.create("http://localhost:8080/test2");
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(Test2Client.class);
    }
}
