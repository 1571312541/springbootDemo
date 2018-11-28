package com.zhangchao.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
@Getter
public class Role {
    private Long id;
    private String name;  //角色名称
    private String sn;  //角色表达式： empMgr
    private List<Permission> permissions;

}
