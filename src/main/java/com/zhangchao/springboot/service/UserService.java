package com.zhangchao.springboot.service;

import com.zhangchao.springboot.entity.User;
import com.zhangchao.springboot.entity.UserClass;

import java.util.List;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/11/12
 */
public interface UserService {

    User getUserById(Integer id);

    Integer deleteUserById(Integer id);

    User getUserByName(String username);

    List<User> getUser();

    Integer addUserAndUserClass(User user, UserClass userClass);

}
