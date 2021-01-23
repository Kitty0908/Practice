package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.UserService;

@Controller
public class UserController {


    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    public UserController(){
        System.out.println("这是Controller的构造方法");
    }
}
