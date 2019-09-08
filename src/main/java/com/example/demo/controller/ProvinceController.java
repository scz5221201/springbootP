package com.example.demo.controller;

import com.example.demo.bean.Province;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;



    @GetMapping("/pro")
    public List<Province> getProvinceName() {
        return provinceService.getProvinceData();

    }

}
