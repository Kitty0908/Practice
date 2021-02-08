package com.wds.springVideo.service.impl;

import com.wds.springVideo.dao.UserDao;
import com.wds.springVideo.entity.User;
import com.wds.springVideo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    public User checkEmail(String email) {

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("email",email);

        List<User> userList = dao.findUserByCondition(map);
        if (userList == null || userList.size() == 0){
            return null;
        }

        return new User();
    }
}
