package com.laoliangcode.service;

import com.laoliangcode.dao.IUserDao;
import com.laoliangcode.dao.UserDao;
import com.laoliangcode.model.User;
import org.springframework.stereotype.Service;

/**
 * {@link User} service类(使用profile方式依赖{@link IUserDao})
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
public class UserServiceForProfile {

    private final IUserDao userDao;

    public UserServiceForProfile(IUserDao userDao) {
        this.userDao = userDao;
    }

    public User findBId(Integer id) {
        return userDao.findBId(id);
    }
}
