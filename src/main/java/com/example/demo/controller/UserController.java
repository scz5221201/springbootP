package com.example.demo.controller;

import com.example.demo.bean.RespBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public RespBean reg(String username, String password){
        int i = userService.reg(username, password);
        if (i==1){
            return RespBean.ok("success");
        } else if (i==-1){
            return RespBean.error("username have exist");
        }
        return RespBean.error("fail");

    }
}
