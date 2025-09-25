package com.mytests.spring.springclienttest.test7clients;


import org.springframework.web.service.annotation.GetExchange;

public interface Test7GroupClient1 {
    @GetExchange(url = "/test71")
    String test71();
}
