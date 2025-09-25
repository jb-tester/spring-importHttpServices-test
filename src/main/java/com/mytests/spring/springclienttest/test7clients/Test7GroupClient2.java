package com.mytests.spring.springclienttest.test7clients;


import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "/test72")
public interface Test7GroupClient2 {
    @GetExchange
    String test72();
}
