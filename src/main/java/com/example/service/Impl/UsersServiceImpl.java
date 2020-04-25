package com.example.service.Impl;

import com.example.entity.Users;
import com.example.mapper.UsersMapper;
import com.example.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="usersService")
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public List<Users> getAll() {
        return usersMapper.getAll();
    }

    @Override
    public Users loginPage(String id, String pwd) {
        return usersMapper.loginPage(id, pwd);
    }
}
