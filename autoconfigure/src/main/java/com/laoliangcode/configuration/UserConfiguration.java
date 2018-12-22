package com.laoliangcode.configuration;

import com.laoliangcode.dao.IUserDao;
import com.laoliangcode.dao.UserDao;
import com.laoliangcode.dao.UserMysqlDao;
import com.laoliangcode.dao.UserOracleDao;
import com.laoliangcode.model.User;
import com.laoliangcode.service.UserService;
import com.laoliangcode.service.UserServiceForProfile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * {@link User} 配置类
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
@Configuration
public class UserConfiguration {

    @Bean
    public UserService userService(UserDao userDao) {
        return new UserService(userDao);
    }

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

}
