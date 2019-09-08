package com.example.demo.mapper;

import com.example.demo.bean.Role;
import org.apache.ibatis.annotations.Param;
import com.example.demo.bean.User;


import java.util.List;

public interface UserMapper {

    int regUser(@Param("username") String username, @Param("password") String password);
    User loadByUserByUsername(String username);
    List<Role> getUserRolesByUid(Integer id);

}
