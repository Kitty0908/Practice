package com.wds.thymeleaf.controller;

import com.wds.thymeleaf.bean.Person;
import com.wds.thymeleaf.service.PersonService;
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

    @GetMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    @PostMapping
    public String add(Person person) {
        personService.add(person);
        return "redirect:/person";
    }

    @DeleteMapping(path = "/{index}")
    public String del(@PathVariable("index") int index) {
        personService.del(index);
        return "redirect:/person";
    }

    @GetMapping("/toEdit/{index}")
    public String toEdit(@PathVariable("index") int index,Model model) {
        model.addAttribute("index", index);
        model.addAttribute(personService.findPersonById(index));
        return "edit";
    }

    @PutMapping
    public String edit(int index, String role) {
        personService.edit(index, role);
        System.out.println("编辑");
        return "redirect:/person";
    }
}
