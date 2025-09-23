package com.mytests.spring.springclienttest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class MyController {

    @GetMapping("/test1")
    public ResponseEntity<String> getTest1() {
        return ResponseEntity.ok("test1 mapping");
    }

    @GetMapping("/test2/{pv1}/{pv2}")
    public String test2(@PathVariable("pv1") String pv1, @PathVariable String pv2) {
        return "test2 mapping with '" + pv1+ "' and '" + pv2 + "'";
    }

    @GetMapping("/test3/test31")
    public String test31() {
        return "test3/test31 mapping";
    }
    @GetMapping("/test3/test32")
    public String test32() {
        return "test3/test32 mapping";
    }
    @GetMapping("/test3/test35")
    public String test35_3() {
        return "test3/test35 mapping";
    }

    @GetMapping("/test5/test51")
    public String test51() {
        return "test5/test51 mapping";
    }
    @GetMapping("/test5/test52")
    public String test52() {
        return "test5/test52 mapping";
    }
    @GetMapping("/test5/test35")
    public String test35_5() {
        return "test5/test35 mapping";
    }

    @GetMapping("/test4/test41")
    public String test41() {
        return "test4/test41 mapping";
    }
    @GetMapping("/test4/test42")
    public String test42() {
        return "test4/test42 mapping";
    }
    @GetMapping("/test4/test43")
    public String test43() {
        return "test4/test43 mapping";
    }

}
