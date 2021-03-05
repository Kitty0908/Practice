package com.wds.thymeleaf.service;

import com.wds.thymeleaf.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface PersonService {

    List<Person> list();

    void del(int index);

    void edit(int index, String role);

    void add(Person person);

    Person findPersonById(int index);
}
