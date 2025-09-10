package com.mytests.spring.springclienttest.test5clients;


import org.springframework.web.service.annotation.GetExchange;

public interface Test5GroupClient1 {
    @GetExchange(url = "/test51")
    String test51();
}
