package com.mytests.spring.springclienttest.clients1;

import org.springframework.web.service.annotation.GetExchange;

public interface Test1Client {
    @GetExchange(url = "http://localhost:8080/test1")
    String test1();
}