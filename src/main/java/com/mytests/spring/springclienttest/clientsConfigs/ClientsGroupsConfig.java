package com.mytests.spring.springclienttest.clientsConfigs;

import com.mytests.spring.springclienttest.test3clients.Test3GroupClient1;
import com.mytests.spring.springclienttest.test3clients.Test3GroupClient2;
import com.mytests.spring.springclienttest.test35clients.Test3Test5Client;
import com.mytests.spring.springclienttest.test4clients1.Test41;
import com.mytests.spring.springclienttest.test4clients2.Test42;
import com.mytests.spring.springclienttest.test5clients.Test5GroupClient1;
import com.mytests.spring.springclienttest.test5clients.Test5GroupClient2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.support.RestClientHttpServiceGroupConfigurer;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(group = "test3", types = {Test3GroupClient1.class, Test3GroupClient2.class, Test3Test5Client.class})
@ImportHttpServices(group = "test5", types = {Test5GroupClient1.class, Test5GroupClient2.class, Test3Test5Client.class})
//@ImportHttpServices(group = "test4group", basePackages = {"com.mytests.spring.springclienttest.test4clients1","com.mytests.spring.springclienttest.test4clients2"})
@ImportHttpServices(group = "test4group", basePackageClasses = {Test41.class, Test42.class})
public class ClientsGroupsConfig {

	@Bean
	public RestClientHttpServiceGroupConfigurer groupConfigurer() {
		return groups -> {

			groups.filterByName("test3").forEachClient((group, clientBuilder) ->
					clientBuilder.baseUrl("http://localhost:8080/"+group.name()).build());
			groups.filterByName("test5").forEachClient((group, clientBuilder) ->
					clientBuilder.baseUrl("http://localhost:8080/"+group.name()).build());
			groups.filterByName("test4group").forEachClient((group, clientBuilder) ->
					clientBuilder.baseUrl("http://localhost:8080/test4").build()
		     );
		};
	}
}