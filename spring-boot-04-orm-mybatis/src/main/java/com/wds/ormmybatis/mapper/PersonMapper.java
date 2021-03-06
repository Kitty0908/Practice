package com.wds.ormmybatis.mapper;

import com.wds.ormmybatis.bean.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapper {

    @Select("SELECT ID,NAME,ROLE FROM PERSON")
    List<Person> findAll();
}
