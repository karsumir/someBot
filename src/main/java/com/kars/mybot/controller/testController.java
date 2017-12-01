package com.kars.mybot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }
}