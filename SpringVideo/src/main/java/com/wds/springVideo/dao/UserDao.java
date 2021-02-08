package com.wds.springVideo.dao;

import com.wds.springVideo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    int insertUser(User user);

    List<User> findUserByCondition(Map<String,Object> map);

    int updateUser(Map<String,Object> map);
}
