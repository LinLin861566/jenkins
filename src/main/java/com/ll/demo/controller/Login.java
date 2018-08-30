package com.ll.demo.controller;


import com.ll.demo.service.interfaces.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author linlin
 * @date 2018/8/9 13:56
 */

@Controller
public class Login {

    public LoginService loginService;

    @RequestMapping("/test")
    public ModelAndView index(){
        //当浏览器输入/test时，会返回 /templates/view下的login.html页面
        return new ModelAndView("login/login") ;
    }

    @RequestMapping("/ifram")
    public ModelAndView ifram(){
        //当浏览器输入/test时，会返回 /templates/view下的login.html页面
        return new ModelAndView("login/register") ;
    }
}
