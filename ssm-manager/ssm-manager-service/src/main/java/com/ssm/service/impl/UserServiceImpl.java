package com.ssm.service.impl;

import com.ssm.mapper.TbUserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public User fandUserById(int id) {
        User user = tbUserMapper.findUserById(id);
        return user;
    }
}
