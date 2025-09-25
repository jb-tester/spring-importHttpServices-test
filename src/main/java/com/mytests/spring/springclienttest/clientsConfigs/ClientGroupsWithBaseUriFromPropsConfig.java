package com.mytests.spring.springclienttest.clientsConfigs;

import com.mytests.spring.springclienttest.test6clients.Test6;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices.Container({
        @ImportHttpServices(group = "test6", basePackageClasses = {Test6.class}),
        @ImportHttpServices(group = "test7", basePackages = {"com.mytests.spring.springclienttest.test7clients"})
})
public class ClientGroupsWithBaseUriFromPropsConfig {

}
