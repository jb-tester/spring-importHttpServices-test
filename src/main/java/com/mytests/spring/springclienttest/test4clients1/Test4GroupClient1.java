package com.mytests.spring.springclienttest.test4clients1;


import org.springframework.web.service.annotation.GetExchange;

public interface Test4GroupClient1 {
    @GetExchange(url = "/test41")
    String test41();
}
