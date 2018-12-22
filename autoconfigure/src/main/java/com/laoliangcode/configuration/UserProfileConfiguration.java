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
public class UserProfileConfiguration {

    @Bean
    public UserServiceForProfile userServiceForProfile(IUserDao userDao) {
        return new UserServiceForProfile(userDao);
    }

    @Bean
    @Profile("mysql")
    public IUserDao userMysqlDao() {
        return new UserMysqlDao();
    }

    @Bean
    @Profile("oracle")
    public IUserDao userOracleDao() {
        return new UserOracleDao();
    }
}
