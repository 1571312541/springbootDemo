package com.zhangchao.springboot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:mytest.properties")
public class UserClass {

  @Value("${userClass.id}")
  private Integer id;
  @Value("${userClass.uid}")
  private Integer uid;
  @Value("${userClass.className}")
  private String className;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  @Override
  public String toString() {
    return "UserClass{" +
            "id=" + id +
            ", uid=" + uid +
            ", className='" + className + '\'' +
            '}';
  }
}
