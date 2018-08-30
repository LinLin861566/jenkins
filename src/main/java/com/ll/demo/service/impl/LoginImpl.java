package com.ll.demo.service.impl;

import com.ll.demo.model.login.LoginUser;
import com.ll.demo.service.interfaces.LoginService;


import java.util.Map;

public class LoginImpl implements LoginService {

    @Override
    public String login(Map<String, Object> param) {
//        LoginUser loginUser = new LoginUser();
//        loginUser.setUserName("小明");
//        loginUser.setPassWord("123456");
//        return loginUser;

        return "Hello Spring Boot!";
    }
}
