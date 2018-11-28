package com.zhangchao.springboot.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈测试@PropertySource读取外部资源文件〉
 *
 * @author 22902
 * @create 2018/11/12
 */

@ToString
@Component
@ConfigurationProperties(prefix = "user")
public class User {

    private Integer id;
    private Integer age;
    private String username;
    /**
     *  当配置文件中属性名与实体类属性名有区别时，使用@value
     */
    @Value("${user.pwd}")
    private String password;
    private String job;
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
