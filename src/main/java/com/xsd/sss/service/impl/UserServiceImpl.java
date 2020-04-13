package com.xsd.sss.service.impl;

import com.xsd.sss.dao.UserDao;
import com.xsd.sss.entity.User;
import com.xsd.sss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUserAll() {
        List<User> all = userDao.findAll();
        return all;
    }
}
