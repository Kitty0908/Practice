package com.wds.template.controller;

import com.wds.conf.FoodConf;
import com.wds.conf.VegetablesConf;
import com.wds.domain.Food;
import com.wds.domain.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

//    @Value("${food.meat}")
//    private String meat;
//    @Value("${food.rice}")
//    private String rice;

    @Autowired
    private FoodConf foodConf;

    @Autowired
    private VegetablesConf vegetablesConf;

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @RequestMapping("/json")
    @ResponseBody
    public Food json(){

        Food food = new Food();
        food.setMeat(foodConf.getMeat());
        food.setRice(foodConf.getRice());

        return food;
    }

    @RequestMapping("/vegetables")
    @ResponseBody
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setMushroom(vegetablesConf.getMushroom());
        vegetables.setChick(vegetablesConf.getChick());

        return vegetables;
    }

    @RequestMapping("/user")
    @ResponseBody
    public String getUser(){
        return username+"\n"+password;
    }










}
