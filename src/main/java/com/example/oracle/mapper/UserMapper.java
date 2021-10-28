package com.example.oracle.mapper;

import com.example.oracle.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Siaze
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有用户，最大返回20条
     * @return 查询的用户列表
     */
    List<User> getAllUsers();
}
