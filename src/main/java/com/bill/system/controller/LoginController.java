package com.bill.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("/successpage")
    public String getSuccess( Map<String,Object> map) {
        System.out.println("你好");
        map.put("hello","<h1>你好世界</h1>");
        map.put("users", Arrays.asList("张三","李四","王五"));
        return "success";
    }
}
