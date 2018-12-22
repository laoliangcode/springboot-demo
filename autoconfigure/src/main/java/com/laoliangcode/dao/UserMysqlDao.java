package com.laoliangcode.dao;

import com.laoliangcode.annotation.UserRepository;
import com.laoliangcode.model.User;

/**
 *  {@link User} 数据访问mysql实现
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
public class UserMysqlDao implements IUserDao{

    public User findBId(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("mysql");
        return user;
    }
}
