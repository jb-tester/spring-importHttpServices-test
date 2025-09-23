package com.mytests.spring.springclienttest.test4clients2;


import org.springframework.web.service.annotation.GetExchange;

public interface Test4GroupClient3 {
    @GetExchange(url = "/test43")
    String test43();
}
