package com.l.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用户模块 启动类
 */
@MapperScan("com.l.user.mapper")
@SpringBootApplication
public class UserApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApplication.class, args);
    }
}
