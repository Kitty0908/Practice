package com.wds.dao;

import com.wds.domain.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    @Results(
            id="selectOne",
            value = {
                    @Result(id = true,property = "uid",column = "uid"),
                    @Result(id = true,property = "uname",column = "uname"),
                    @Result(id = true,property = "upassword",column = "upassword")
            }
    )
    @Select("SELECT UID,UNAME,UPASSWORD FROM USER WHERE UID = #{uid}")
    public User selectOne(Integer uid);
}
