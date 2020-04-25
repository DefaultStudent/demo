package com.example.controller;

import com.example.entity.Users;
import com.example.service.UsersService;
import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@SpringBootApplication
@ComponentScan("com.example")
@MapperScan("com.example.mapper")
public class HelloController {

    private Logger logger = Logger.getLogger(HelloController.class);

    @Autowired
    private UsersService usersService;

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/fail")
    @ResponseBody
    public String fail() {
        return "Failed";
    }

    @RequestMapping(value = "/all", method = {RequestMethod.POST, RequestMethod.GET})
    private void getAllUsers(HttpServletRequest request,
                             HttpServletResponse response) throws Exception {

        List<Users> listUsers = usersService.getAll();
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");

        Users user = usersService.loginPage(id, pwd);

        if (user == null) {
            logger.info("用户不存在");
            response.sendRedirect(request.getContextPath() + "/fail");
        } else {
            response.sendRedirect(request.getContextPath() + "/hello");
        }
    }

    @RequestMapping("/start")
    private ModelAndView start() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

}
