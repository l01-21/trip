package com.l.user.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.l.user.domain.User;
import com.l.user.mapper.UserMapper;
import com.l.user.service.UserService;

public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
