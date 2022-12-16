package com.zzy.springboot009thymeleaf.controller;

import com.zzy.springboot009thymeleaf.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("data", "你就是歌姬吧！");
        return "hello";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest request) {
        request.setAttribute("student", new Student("田所浩二", 24));
        return "test2";
    }

    @GetMapping("/test3")
    public String test3(HttpServletRequest request) {
        request.setAttribute("student", new Student("田所浩二", 24));
        return "test3";
    }

    @GetMapping("/link")
    public String link(HttpServletRequest request) {
        request.setAttribute("id", 114514);
        request.setAttribute("name", "田所浩二");
        return "test4";
    }

    @GetMapping("/queryStudent")
    @ResponseBody
    public String queryStudent(Integer id, String name) {
        return "id = " + id + " name = " + name;
    }

    @GetMapping("/listStudent")
    public String listStudent(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("田所浩二", 24));
        list.add(new Student("田所浩二", 24));
        list.add(new Student("田所浩二", 24));
        list.add(new Student("田所浩二", 24));
        model.addAttribute("stuList", list);
        return "eachList";
    }

    @GetMapping("/listDataSource")
    public String listDataSource(Model model) {
        Map<String, String> map = new HashMap<>();
        map.put("username", "root");
        map.put("password", "991118");
        model.addAttribute("dataSource", map);
        return "eachMap";
    }

    @GetMapping("/listMap")
    public String listMap(Model model) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("username", "root");
        map1.put("password", "991118");
        list.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("driver", "com.cj.jdbc.Driver");
        map2.put("url", "jdbc://localhost:3306/watermonitor");
        list.add(map2);

        model.addAttribute("list", list);
        return "listMap";
    }

    @GetMapping("/login")
    public String ifTest(Model model) {
        model.addAttribute("isLogin", true);
        return "if";
    }

    @GetMapping("/nologin")
    public String ifTest2() {
        return "if";
    }

    @GetMapping("/switch")
    public String switchTest(Model model) {
        model.addAttribute("grade", 90);
        return "switch";
    }

    @GetMapping("/inlineText")
    public String inline(Model model) {
        model.addAttribute("name", "田所浩二");
        return "inline";
    }

    @GetMapping("/request")
    public String requestTest(HttpServletRequest request) {
        return "request";
    }
}
