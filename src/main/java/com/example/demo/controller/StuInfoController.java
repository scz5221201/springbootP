package com.example.demo.controller;

import com.example.demo.bean.StuInfo;
import com.example.demo.service.StuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StuInfoController {

    @Autowired
    StuInfoService stuInfoService;

    @RequestMapping(value = "/check_stu", method = RequestMethod.GET)
    public List<StuInfo> getStuInfo(String ksh, String xm, String sfzh) {
        return stuInfoService.getStuInfo(ksh, xm, sfzh);

    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
