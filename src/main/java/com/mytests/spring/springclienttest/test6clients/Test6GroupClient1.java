package com.mytests.spring.springclienttest.test6clients;


import org.springframework.web.service.annotation.GetExchange;

public interface Test6GroupClient1 {
    @GetExchange(url = "/test61")
    String test61();
}
