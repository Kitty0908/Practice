package com.wds.util;

import com.mysql.cj.Session;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionUtil {

    private static SqlSessionFactory factory;

    static{
        factory = new SqlSessionFactoryBuilder().build(
                Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("mybatis-config.xml")
        );
    }

    public static SqlSession getSession(){
        return factory.openSession();
    }

    public static SqlSession getSession(Boolean b){
        return factory.openSession(b);
    }

    public static <T>T getMapper(Class clazz){
        return (T)factory.openSession().getMapper(clazz);
    }
}
