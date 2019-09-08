package com.example.demo.service;

import com.example.demo.bean.Statistic;
import com.example.demo.mapper.StatisticMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticService {

    @Autowired(required = false)
    StatisticMapper statisticMapper;
    public List<Statistic> getStatisticData(){
        statisticMapper.setStatisticData();
        return statisticMapper.getStatisticData();
    }
}
