package com.l.user.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户表(User)实体类
 */
@Data
public class User implements Serializable {
   /**
     * 用户ID，主键自增
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 手机号码，唯一
     */
    private String phone;
    /**
     * 邮箱地址
     */
    private String email;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 角色
     */
    private Integer role;
    /**
     * 等级
     */
    private Integer level;
    /**
     * 城市
     */
    private String city;
    /**
     * 头像URL
     */
    private String avatar;
    /**
     * 个人信息
     */
    private String info;
    /**
     * 状态
     */
    private Long state;
    /**
     * 创建时间（时间戳）
     */
    private Long createTime;
    /**
     * 修改时间（时间戳）
     */
    private Long updateTime;
}

