package com.mytests.spring.springclienttest.test6clients;


import org.springframework.web.service.annotation.GetExchange;

public interface Test6GroupClient2 {
    @GetExchange(url = "/test62")
    String test62();
}
