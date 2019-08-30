package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }

}
