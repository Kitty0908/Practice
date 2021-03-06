package com.wds.tkmybatis.service.impl;

import com.wds.tkmybatis.bean.Person;
import com.wds.tkmybatis.service.PersonService;
import com.wds.tkmybatis.tk.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper dao;

    @Override
    public List<Person> list() {
        return dao.selectAll();
    }
}
