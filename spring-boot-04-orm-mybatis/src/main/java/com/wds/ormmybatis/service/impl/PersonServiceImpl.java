package com.wds.ormmybatis.service.impl;


import com.wds.ormmybatis.bean.Person;
import com.wds.ormmybatis.mapper.PersonMapper;
import com.wds.ormmybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper dao;

    @Override
    public List<Person> list() {
        return dao.findAll();
    }
}
