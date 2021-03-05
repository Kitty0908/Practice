package com.wds.springVideo.controller;

import cn.hutool.core.util.StrUtil;
import com.wds.springVideo.dto.ResponseResult;
import com.wds.springVideo.entity.User;
import com.wds.springVideo.exception.UserException;
import com.wds.springVideo.service.UserService;
import com.wds.springVideo.util.Contains;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashSet;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path="/checkEmail",params="email")
    @ResponseBody
    public ResponseResult checkEmail(String email){

        ResponseResult result = new ResponseResult(1,"ok",null);

        if(StrUtil.isEmpty(email)){
            result.setCode(-1);
            result.setMessage("Email格式不正确");
            return result;
        }

        User user = userService.checkEmail(email);

        if(user != null){
            result.setMessage("用户已存在，请重新输入");
            result.setCode(0);
            return result;
        }

        return result;
    }


    @RequestMapping("/regist")
    public String regist(String email, String password, String vCode, HttpSession session) throws UserException {
        if(StrUtil.isEmpty(email)){
            throw new UserException("邮箱为空");
        }
        String pattern = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        if(!email.matches(pattern)){
            throw new UserException("邮箱格式不规范"+email);
        }
        if(StrUtil.isEmpty(password)){
            throw new UserException("密码为空");
        }
        if(password.length()<6 || password.length()>16){
            throw new UserException("密码长度有误"+password.length());
        }
        if(userService.checkEmail(email) != null){
            throw new UserException("用户已存在");
        }
        String sessionVCode = (String)session.getAttribute(Contains.SESSION_VCODE);
        if(StrUtil.isEmpty(sessionVCode)){
            throw new UserException("会话注册验证码为空");
        }
        if(StrUtil.isEmpty(vCode)){
            throw new UserException("请求注册验证码为空");
        }
        if(sessionVCode.equals(vCode)){
            throw new UserException("注册验证码不正确");
        }

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user = userService.userReg(user);
        if(user == null){
            throw new UserException("添加用户失败");
        }
        session.setAttribute(Contains.SESSION_LOGIN_USER,user);
        return "redirect:/";
    }

    @RequestMapping("/checkVCode")
    @ResponseBody
    public ResponseResult checkVCode(String vCode,HttpSession session) throws UserException {
        ResponseResult result = new ResponseResult(1,"ok",null);
        String sessionVCode = (String)session.getAttribute(Contains.SESSION_VCODE);
        if(StrUtil.isEmpty(sessionVCode)){
            throw new UserException("会话验证码为空");
        }
        if(StrUtil.isEmpty(vCode) || !sessionVCode.equals(vCode)){
            result.setMessage("验证码输入错误");
            result.setCode(0);
            return result;
        }
        return result;
    }
}
