package com.mytests.spring.springclienttest.clients1;


import org.springframework.web.service.annotation.GetExchange;

public interface Test3GroupClient2 {
    @GetExchange(url = "/test32")
    String test32();
}
