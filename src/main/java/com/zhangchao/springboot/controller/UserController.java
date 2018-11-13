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
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger =  LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

    /*@RequestMapping("/index")
    public String setKey(Model model){
        System.out.println("-----------------------返回index.html");
        model.addAttribute("key","setKey");
        return "index";
    }*/

   @RequestMapping("/getUser")
    public List<User> getUser(){
       List<User> user = userService.getUser();

       for (User user1 : user) {
           System.out.println(user1);
           logger.error("=========="+user1);
       }
       return user;
    }

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
