package com.example.web;

import com.example.entity.Users;
import com.example.service.UsersService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@SpringBootApplication
@ComponentScan("com.example")
@MapperScan("com.example.mapper")
public class HelloController {

    @Autowired
    private UsersService usersService;

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/all")
    @ResponseBody
    private void getAllUsers(HttpServletResponse response) throws Exception {
        List<Users> listUsers = usersService.getAll();
        System.out.println("hhh");
    }

}
