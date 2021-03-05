package com.wds.thymeleaf.controller;

import com.wds.thymeleaf.bean.Person;
import com.wds.thymeleaf.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Person> personList = personService.list();
        model.addAttribute(personList);
        return "list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    @RequestMapping("/add")
    public String add(Person person) {
        personService.add(person);
        return "redirect:list";
    }

    @RequestMapping("/del")
    public String del(int index) {
        personService.del(index);
        return "redirect:list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model, int index) {
        model.addAttribute("index", index);
        model.addAttribute(personService.findPersonById(index));
        return "edit";
    }

    @RequestMapping("/edit")
    public String edit(int index, String role) {
        personService.edit(index, role);
        return "redirect:list";
    }
}
