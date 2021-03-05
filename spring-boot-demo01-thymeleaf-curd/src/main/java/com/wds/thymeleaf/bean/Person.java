package com.wds.thymeleaf.bean;

import lombok.Data;

@Data
public class Person {

    private String name;
    private String role;

    public Person() {
    }

    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
