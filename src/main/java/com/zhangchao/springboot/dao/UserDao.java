package com.zhangchao.springboot.dao;

import com.zhangchao.springboot.entity.User;
import com.zhangchao.springboot.entity.UserClass;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/11/12
 */
@Repository
public interface UserDao {

    List<User> getUser();

    Integer addUser(User user);

    Integer addUserClass(UserClass userClass);


}
