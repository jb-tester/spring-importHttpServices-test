package com.mytests.spring.springclienttest;

import com.mytests.spring.springclienttest.clients1.Test1Client;
import com.mytests.spring.springclienttest.clients1.Test2Client;
import com.mytests.spring.springclienttest.clients1.Test3GroupClient1;
import com.mytests.spring.springclienttest.clients1.Test3GroupClient2;
import com.mytests.spring.springclienttest.clients2.Test4GroupClient1;
import com.mytests.spring.springclienttest.clients2.Test4GroupClient2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringClientTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringClientTestApplication.class, args);
    }
    @Bean
    ApplicationRunner runner(Test1Client test1Client, Test2Client test2Client,
                             Test3GroupClient1 test3GroupClient1 , Test3GroupClient2 test3GroupClient2,
                             Test4GroupClient1 test4GroupClient1 , Test4GroupClient2 test4GroupClient2
    ) {
        return args -> {
            String test1 = test1Client.test1();
            System.out.println("**********************************");
            System.out.println(test1);
            String test2 = test2Client.test2("aaa", "bbb");
            System.out.println("**********************************");
            System.out.println(test2);
            String test31 = test3GroupClient1.test31();
            System.out.println("**********************************");
            System.out.println(test31);
            String test32 = test3GroupClient2.test32();
            System.out.println("**********************************");
            System.out.println(test32);
            String test41 = test4GroupClient1.test41();
            System.out.println("**********************************");
            System.out.println(test41);
            String test42 = test4GroupClient2.test42();
            System.out.println("**********************************");
            System.out.println(test42);
            System.out.println("**********************************");

        };
    }
}
