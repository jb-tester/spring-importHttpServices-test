package com.mytests.spring.springclienttest.clients2;


import org.springframework.web.service.annotation.GetExchange;

public interface Test4GroupClient1 {
    @GetExchange(url = "/test41")
    String test41();
}
