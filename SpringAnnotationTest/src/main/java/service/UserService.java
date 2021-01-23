package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDao dao;

    @Autowired
    public void setDao(UserDao dao){
        this.dao = dao;
    }

    public UserService(){
        System.out.println("这是Service的构造方法");
    }
}
