package org.wang.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wang.sms.model.User;
import org.wang.sms.repository.UserDao;
import org.wang.sms.service.UserService;

import java.util.List;

/**
 * Created by ozintel06 on 16/6/21.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService  {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public User findByNameAndPassWord(String username, String password) {
        return userDao.findByNameAndPassWord(username,password);
    }

    @Override
    public User findOne(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public List<User> findStudentByClazzId(Integer id) {
        return userDao.findStudentByClazzId(id);
    }

    @Override
    public Integer save(User student) {
        return userDao.save(student).getId();
    }
}
