package com.wds.springVideo.controller;

import com.wds.springVideo.dao.UserDao;
import com.wds.springVideo.dto.ResponseResult;
import com.wds.springVideo.entity.User;
import com.wds.springVideo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/checkEmail")
    @ResponseBody
    public ResponseResult checkEmail(String email){

        ResponseResult result = new ResponseResult(1,"true",null);

        if(email == null || "".equals(email)){
            result.setCode(-1);
            result.setMessage("false");
            return result;
        }

        User user = userService.checkEmail(email);

        if(user != null){
            if(user.getEmail() != null && "".equals(user.getEmail())){
                result.setMessage("false");
                result.setCode(0);
                return result;
            }
        }

        return result;
    }


    @RequestMapping("/regist")
    public String regist(User user){

        return "index";
    }
}
