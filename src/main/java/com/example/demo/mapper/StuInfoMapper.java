package com.example.demo.mapper;

import com.example.demo.bean.StuInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface StuInfoMapper {

    List<StuInfo> loadStudent(@Param("ksh") String ksh, @Param("xm") String xm, @Param("sfzh") String sfzh);
}
