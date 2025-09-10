package com.mytests.spring.springclienttest.test12clients;

import org.springframework.web.service.annotation.GetExchange;

public interface Test1Client {
    @GetExchange(url = "http://localhost:8080/test1")
    String test1();
}