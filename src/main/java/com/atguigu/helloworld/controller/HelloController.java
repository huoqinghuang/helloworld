package com.atguigu.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Value("${server.port}")//@Value可以再项目启动时从配置文件中获取server.port key 对应的值
    Integer port;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){



        return "access"+ port+"port";
    }
}
