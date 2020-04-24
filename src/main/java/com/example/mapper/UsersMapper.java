package com.example.mapper;

import com.example.entity.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper {

    List<Users> getAll();
    Users loginPage(String id, String name);
}
