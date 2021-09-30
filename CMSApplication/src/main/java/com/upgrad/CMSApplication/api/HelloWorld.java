package com.upgrad.CMSApplication.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String sayHello(){
        return "Hello from API";
    }
}
