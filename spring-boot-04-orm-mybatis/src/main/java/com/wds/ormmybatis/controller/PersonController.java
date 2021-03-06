package com.wds.ormmybatis.controller;

import com.wds.ormmybatis.bean.Person;
import com.wds.ormmybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

@RequestMapping(path = "/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    public String list(Model model) {
        List<Person> personList = personService.list();
        model.addAttribute(personList);
        return "list";
    }
}
