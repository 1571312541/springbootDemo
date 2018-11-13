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

    List<User> getUser();

    Integer addUserAndUserClass(User user, UserClass userClass);

}
