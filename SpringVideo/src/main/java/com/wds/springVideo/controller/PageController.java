package com.wds.springVideo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import java.util.HashMap;

@Controller
public class PageController {

    @RequestMapping(value = "/")
    public String indexPage(){
        return "index";
    }
}
