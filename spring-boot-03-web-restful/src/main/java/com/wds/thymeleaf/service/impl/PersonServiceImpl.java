package com.wds.thymeleaf.service.impl;


import com.wds.thymeleaf.bean.Person;
import com.wds.thymeleaf.dao.PersonDao;
import com.wds.thymeleaf.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao dao;

    @Override
    public List<Person> list() {
        return dao.list();
    }

    @Override
    public void del(int index) {
        dao.del(index);
    }

    @Override
    public void edit(int index, String role) {
        dao.edit(index, role);
    }

    @Override
    public void add(Person person) {
        dao.add(person);
    }

    @Override
    public Person findPersonById(int index) {
        return dao.findPersonById(index);
    }
}
