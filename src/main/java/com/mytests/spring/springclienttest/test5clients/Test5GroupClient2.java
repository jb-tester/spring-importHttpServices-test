package com.mytests.spring.springclienttest.test5clients;


import org.springframework.web.service.annotation.GetExchange;

public interface Test5GroupClient2 {
    @GetExchange(url = "/test52")
    String test52();
}
