package com.zhangchao.springboot.dao;

import com.zhangchao.springboot.entity.User;
import com.zhangchao.springboot.entity.UserClass;
import com.zhangchao.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.zhangchao.springboot.dao") //必须扫描dao层
@SpringBootTest
public class SpringbootdemoApplicationTests {

    @Autowired
    private UserService userService;

    /**
     * 测试springboot事务
     */
    @Test
    public void addUserAndUserClass() {
        User user = new User();
        user.setAge(33);
        user.setJob("学生");
        user.setUsername("wangba");
        user.setPassword("admin");

        UserClass userClass = new UserClass();
        userClass.setClassName("八班");

        userService.addUserAndUserClass(user,userClass);

    }

}
