package com.example.mapper;

import com.example.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsersMapper {

    /**
     * 获取全部用户信息
     * @return
     */
    List<Users> getAll();

    /**
     * 根据用户Id和密码获取用户信息
     * @param id 用户Id
     * @param pwd 用户密码
     * @return
     */
    Users loginPage(String id, String pwd);
}
