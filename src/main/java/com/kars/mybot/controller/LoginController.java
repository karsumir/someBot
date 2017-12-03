package com.kars.mybot.controller;

import com.kars.mybot.Form.LoginForm;
import com.kars.mybot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService service;

    @RequestMapping("/")
    public String login(LoginForm form) {

//        ResultEnum e = service.getLogin(form).getValue();


        return service.getLogin(form).getValue();
    }
}