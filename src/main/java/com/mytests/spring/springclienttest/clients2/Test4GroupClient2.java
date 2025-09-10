package com.mytests.spring.springclienttest.clients2;


import org.springframework.web.service.annotation.GetExchange;

public interface Test4GroupClient2 {
    @GetExchange(url = "/test42")
    String test42();
}
