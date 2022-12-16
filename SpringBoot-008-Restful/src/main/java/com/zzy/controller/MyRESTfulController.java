package com.zzy.controller;

import org.springframework.web.bind.annotation.*;

@RestController // Controller + ResponseBody
public class MyRESTfulController {

    /**
     * 获取资源
     * @param stuNo
     * @return
     */
    @GetMapping("/queryStudent/{stuNo}")
    public String queryStudent(@PathVariable("stuNo") String stuNo) {
        return "查询学号为" + stuNo + "的学生";
    }

    /**
     * 创建资源
     */
    @PostMapping("/addStudent/{name}/{age}")
    public String addStudent(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        return "创建学生：name = " + name + " age = " + age;
    }

    /**
     * 更新资源
     */
    @PutMapping("/modifyStudent/{id}/{name}")
    public String modifyStudent(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        return "更新学生信息，id = " + id + " 姓名 = " + name;
    }

    /**
     * 删除资源
     */
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") Integer id) {
        return "删除学生id = " + id;
    }
}
