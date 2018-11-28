package com.zhangchao.springboot.service.impl;

import com.zhangchao.springboot.dao.UserDao;
import com.zhangchao.springboot.entity.User;
import com.zhangchao.springboot.entity.UserClass;
import com.zhangchao.springboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/11/12
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public Integer deleteUserById(Integer id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public User getUserByName(String username) {
        return userDao.getUserByName(username);
    }

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }

    /**
     *  Transactional 声明在类上面：类的所有方法有效,声明在方法上面：该方法有效
     * @param user
     * @param userClass
     * @return
     */
    @Transactional
    @Override
    public Integer addUserAndUserClass(User user, UserClass userClass) {
        userDao.addUser(user);
        userClass.setUid(user.getId()); //测试事务，发生异常时，是否会回滚,当注释掉这一行时，会报错，会回滚，证明事务
        Integer row = userDao.addUserClass(userClass);
        System.out.println(row+"=================");
        return row;
    }
}
