package com.example.demo.mapper;

import com.example.demo.bean.Statistic;

import java.util.List;
import java.util.Map;

public interface StatisticMapper {
    public void setStatisticData();
    public List<Statistic> getStatisticData();
    public Map<String, Integer> getSfsj();
}
