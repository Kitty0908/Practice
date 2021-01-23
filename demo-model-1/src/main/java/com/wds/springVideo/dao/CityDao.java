package com.wds.dao;

import com.wds.domain.City;
import com.wds.util.MySqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class CityDao {

    public City selectOne(Integer cityid){
        SqlSession session = MySqlSessionUtil.getSession(true);

        return session.selectOne("com.wds.dao.CityDao.selectOne",cityid);
    }
}
