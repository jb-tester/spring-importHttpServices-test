package com.mytests.spring.springclienttest.clientsConfigs;

import com.mytests.spring.springclienttest.clients1.Test1Client;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(Test1Client.class)
public class Test1ClientConfig {

}