package com.laoliangcode.service;

import com.laoliangcode.dao.UserDao;
import com.laoliangcode.model.User;
import org.springframework.stereotype.Service;

/**
 * {@link User} service类
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findBId(Integer id) {
        return userDao.findBId(id);
    }
}
