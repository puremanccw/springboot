package com.puremancw.service.impl;

import com.puremancw.domain.User;
import com.puremancw.mapper.UserMapper;
import com.puremancw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by puremancw on 2016/12/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean add(User user) {
        return userMapper.insert(user) > 0;
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.findUserByName(name);
    }
}
