package com.wds.jpa.service.impl;


import com.wds.jpa.bean.Person;
import com.wds.jpa.repository.PersonRepository;
import com.wds.jpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {


    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> list() {
        return repository.findAll();
    }
}
