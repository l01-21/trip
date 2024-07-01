package com.l.user.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 管理员(Admin)实体类
 */
@Data
public class Admin implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 管理员
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 创建时间（时间戳）
     */
    private Long createTime;
    /**
     * 权限
     */
    private Integer role;
    /**
     * 修改时间（时间戳）
     */
    private Long updateTime;
}

