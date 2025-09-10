package com.mytests.spring.springclienttest.test35clients;


import org.springframework.web.service.annotation.GetExchange;

public interface Test3Test5Client {
    @GetExchange(url = "/test35")
    String test35();
}
