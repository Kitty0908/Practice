package com.wds.template.controller;

import com.wds.template.bean.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class FTLController {

    @Autowired
    private Restaurant restaurant;

    @RequestMapping("/ftl")
    public String ftl(Model model){
        model.addAttribute("now", new Date().toString());
        return "freemarker/index";
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute(restaurant);
        model.addAttribute("uri","welcome");
        model.addAttribute("name","<h5>王</h5>");
        return "thymeleaf/index";
    }

    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome(){
        return "welcome";
    }
}
