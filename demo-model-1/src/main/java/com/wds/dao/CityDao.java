package com.wds.dao;

import com.wds.domain.City;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class CityDao {

    public City selectOne(Integer cityid){
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = builder.build(is);
        SqlSession session = factory.openSession(true);

        return session.selectOne("selectOne",cityid);
    }
}
