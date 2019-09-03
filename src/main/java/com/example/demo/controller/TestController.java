package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }

    @RequestMapping("/test2")
    public String test2() {
        return "hello world22222222222222222222";
    }

}
