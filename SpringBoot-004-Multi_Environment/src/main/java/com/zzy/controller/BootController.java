package com.zzy.controller;

import com.zzy.pojo.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BootController {
    @Value("${server.port}")
    private Integer port;

    @Resource // 默认根据名称装配，其次根据类型
    private DataSource dataSource;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "访问端口号为：" + port;
    }

    @RequestMapping("/hello02")
    @ResponseBody
    public String getDataSource() {
        return dataSource.toString();
    }
}
