package dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public UserDao() {
        System.out.println("这是Dao的构造方法");
    }
}
