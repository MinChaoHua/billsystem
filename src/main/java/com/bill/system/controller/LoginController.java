package com.bill.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
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
    @PostMapping(value = "/tologin")
    public String toLogin(@RequestParam("username") String usernmae,
                          @RequestParam("password")String password,
                          Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(usernmae) && "mch".equals(password)){
            session.setAttribute("userinfo",usernmae);
            return "redirect:/dashboard";
        }else{
            map.put("msg","用户名或密码错误");
            return "index";
        }

    }
}
