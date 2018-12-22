package com.laoliangcode.dao;

import com.laoliangcode.annotation.UserRepository;
import com.laoliangcode.model.User;
import org.springframework.stereotype.Repository;

/**
 *  {@link User} 数据访问类
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
//@Repository
@UserRepository
public class UserDao {

    public User findBId(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("laoliang");
        return user;
    }
}
