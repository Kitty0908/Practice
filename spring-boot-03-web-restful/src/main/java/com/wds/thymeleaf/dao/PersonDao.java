package com.wds.thymeleaf.dao;

import com.wds.thymeleaf.bean.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDao {

    private List<Person> personList = new ArrayList<>();

    {
        personList.add(new Person("张三丰", "掌门"));
        personList.add(new Person("殷六侠", "执法长老"));
        personList.add(new Person("郭靖", "荣誉长老"));
        personList.add(new Person("张无忌", "内门弟子"));
        personList.add(new Person("杨过", "外门弟子"));
    }

    public List<Person> list() {
        return this.personList;
    }

    public void del(int index) {
        personList.remove(index);
    }

    public void add(Person person) {
        personList.add(person);
    }

    public void edit(int index, String role) {
        personList.get(index).setRole(role);
    }

    public Person findPersonById(int index) {
        return personList.get(index);
    }

}
