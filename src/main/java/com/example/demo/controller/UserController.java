package com.example.demo.controller;

import com.example.demo.bean.RespBean;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户数据接口")
public class UserController {

    @Autowired
    UserService userService;


    @ApiOperation(value = "用户注册", notes = "注册时需要用户名和密码")
    @ApiImplicitParam(paramType = )
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
