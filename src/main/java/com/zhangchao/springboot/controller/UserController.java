package com.zhangchao.springboot.controller;

import com.zhangchao.springboot.entity.User;
import com.zhangchao.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/11/12
 * RestController 这个注解是Controller和ResponseBody结合
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     *    日志
     */
    private static Logger logger =  LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

   @RequestMapping("/getUser")
    public List<User> getUser(){
       List<User> user = userService.getUser();
       for (User user1 : user) {
           System.out.println(user1);
           logger.error("=========="+user1);
       }
       return user;
    }

}
