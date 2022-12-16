package com.zzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/hello") // 请求的访问路径
    @ResponseBody
    public String hello() {
        return "欢迎使用 SpringBoot";
    }
}
