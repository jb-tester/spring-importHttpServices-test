package com.mytests.spring.springclienttest;

import com.mytests.spring.springclienttest.test12clients.Test1Client;
import com.mytests.spring.springclienttest.test12clients.Test2Client;
import com.mytests.spring.springclienttest.test35clients.Test3Test5Client;
import com.mytests.spring.springclienttest.test3clients.Test3GroupClient1;
import com.mytests.spring.springclienttest.test3clients.Test3GroupClient2;
import com.mytests.spring.springclienttest.test4clients1.Test4GroupClient1;
import com.mytests.spring.springclienttest.test4clients1.Test4GroupClient2;
import com.mytests.spring.springclienttest.test4clients2.Test4GroupClient3;
import com.mytests.spring.springclienttest.test5clients.Test5GroupClient1;
import com.mytests.spring.springclienttest.test5clients.Test5GroupClient2;
import com.mytests.spring.springclienttest.test6clients.Test6GroupClient1;
import com.mytests.spring.springclienttest.test6clients.Test6GroupClient2;
import com.mytests.spring.springclienttest.test7clients.Test7GroupClient1;
import com.mytests.spring.springclienttest.test7clients.Test7GroupClient2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.service.registry.HttpServiceProxyRegistry;

@SpringBootApplication
public class SpringClientTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringClientTestApplication.class, args);
    }
    @Bean
    ApplicationRunner runner(Test1Client test1Client, Test2Client test2Client,
                             Test3GroupClient1 test3GroupClient1 , Test3GroupClient2 test3GroupClient2,
                             Test4GroupClient1 test4GroupClient1 , Test4GroupClient2 test4GroupClient2, Test4GroupClient3 test4GroupClient3,
                             Test5GroupClient1 test5GroupClient1 , Test5GroupClient2 test5GroupClient2,
                             Test6GroupClient1 test6GroupClient1 , Test6GroupClient2 test6GroupClient2,
                             Test7GroupClient1 test7GroupClient1 , Test7GroupClient2 test7GroupClient2,
                             HttpServiceProxyRegistry registry
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
            String test43 = test4GroupClient3.test43();
            System.out.println("**********************************");
            System.out.println(test43);
            String test51 = test5GroupClient1.test51();
            System.out.println("**********************************");
            System.out.println(test51);
            String test52 = test5GroupClient2.test52();
            System.out.println("**********************************");
            System.out.println(test52);
            String test3test5_3 = registry.getClient("test3", Test3Test5Client.class).test35();
            System.out.println("**********************************");
            System.out.println(test3test5_3);
            String test3test5_5 = registry.getClient("test5", Test3Test5Client.class).test35();
            System.out.println("**********************************");
            System.out.println(test3test5_5);
            String test61 = test6GroupClient1.test61();
            System.out.println("**********************************");
            System.out.println(test61);
            String test62 = test6GroupClient2.test62();
            System.out.println("**********************************");
            System.out.println(test62);
            String test71 = test7GroupClient1.test71();
            System.out.println("**********************************");
            System.out.println(test71);
            String test72 = test7GroupClient2.test72();
            System.out.println("**********************************");
            System.out.println(test72);
            System.out.println("**********************************");

        };
    }
}
