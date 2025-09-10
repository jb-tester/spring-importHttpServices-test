package com.mytests.spring.springclienttest.test3clients;


import org.springframework.web.service.annotation.GetExchange;

public interface Test3GroupClient1 {
    @GetExchange(url = "/test31")
    String test31();
}
