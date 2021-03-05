package com.wds.springVideo.service.impl;

import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.crypto.digest.Digester;
import com.wds.springVideo.dao.UserDao;
import com.wds.springVideo.entity.User;
import com.wds.springVideo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
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

    public User userReg(User user){
        user.setVipFlag(0);
        user.setCreateTime(new Date());
        user.setPassword(DigestUtil.md5Hex(user.getPassword()));
        if(dao.insertUser(user) != 1){
            return null;
        }
        return user;
    }
}
