package com.zhangchao.springboot.entity;

/**
 * 〈测试@PropertySource读取外部资源文件〉
 *
 * @author 22902
 * @create 2018/11/12
 */
public class User {

    private Integer id;
    private Integer age;
    private String username;
    private String password;
    private String job;

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

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
