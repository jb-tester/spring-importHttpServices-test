package com.mytests.spring.springclienttest.clientsConfigs;

import com.mytests.spring.springclienttest.clients1.Test3GroupClient1;
import com.mytests.spring.springclienttest.clients1.Test3GroupClient2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.support.RestClientHttpServiceGroupConfigurer;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(group = "test3", types = {Test3GroupClient1.class, Test3GroupClient2.class})
@ImportHttpServices(group = "test4group", basePackages = {"com.mytests.spring.springclienttest.clients2"})
public class ClientsGroupsConfig {

	@Bean
	public RestClientHttpServiceGroupConfigurer groupConfigurer() {
		return groups -> {

			groups.filterByName("test3").forEachClient((group, clientBuilder) ->

					clientBuilder.baseUrl("http://localhost:8080/"+group.name()).build());

			groups.filterByName("test4group").forEachClient((group, clientBuilder) ->
					clientBuilder.baseUrl("http://localhost:8080/test4").build()
		     );
		};
	}
}