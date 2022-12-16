package com.zzy.service.impl;

import com.zzy.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello() {
        System.out.println("你好");
    }
}
