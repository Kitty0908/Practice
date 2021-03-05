package com.wds.jpa.controller;

import com.wds.jpa.bean.Person;
import com.wds.jpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
