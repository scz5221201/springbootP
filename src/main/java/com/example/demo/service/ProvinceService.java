package com.example.demo.service;

import com.example.demo.bean.Province;
import com.example.demo.mapper.ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProvinceService {
    @Autowired(required = false)
    ProvinceMapper provinceMapper;

    public List<Province> getProvinceData() {
        return provinceMapper.getProvinceData();
    }
}
