package com.example.demo.service;

import com.example.demo.bean.StuInfo;
import com.example.demo.mapper.StuInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuInfoService {

    @Autowired(required = false)
    StuInfoMapper stuInfoMapper;

    public List<StuInfo> getStuInfo(String ksh, String xm, String sfzh) {
        return stuInfoMapper.loadStudent(ksh, xm, sfzh);
    }

}
