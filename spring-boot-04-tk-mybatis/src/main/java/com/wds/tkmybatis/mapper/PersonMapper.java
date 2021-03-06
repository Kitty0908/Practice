package com.wds.tkmybatis.mapper;

import com.wds.tkmybatis.bean.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapper {

    @Select("SELECT ID,NAME,ROLE FROM PERSON")
    List<Person> findAll();
}
