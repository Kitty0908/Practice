package com.wds.template.controller;

import com.wds.domain.View;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "Hello World！！";
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public Object helloUser(String name){
        View v = new View(1,"Hello World");
        if(name != null && !"".equals(name)){
            v.setContent("Hello "+name);
        }
        return v;
    }
}

