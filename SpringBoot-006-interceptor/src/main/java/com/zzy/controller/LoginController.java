package com.zzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    @ResponseBody
    public String login() {
        return "user/login";
    }

    @RequestMapping("/user/account")
    @ResponseBody
    public String account() {
        return "user/account";
    }
}
