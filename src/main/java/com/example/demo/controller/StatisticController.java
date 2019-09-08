package com.example.demo.controller;

import com.example.demo.bean.Statistic;
import com.example.demo.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatisticController {

    @Autowired
    StatisticService statisticService;

    @GetMapping("/statistic")
    public List<Statistic> getStatisticData(){
        return statisticService.getStatisticData();
    }

}
