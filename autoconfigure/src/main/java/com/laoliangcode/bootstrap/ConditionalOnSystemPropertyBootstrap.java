package com.laoliangcode.bootstrap;

import com.laoliangcode.annotation.EnableUserConfig;
import com.laoliangcode.condition.ConditionalOnSystemProperty;
import com.laoliangcode.configuration.UserConfiguration;
import com.laoliangcode.dao.UserDao;
import com.laoliangcode.model.User;
import com.laoliangcode.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * {@link ConditionalOnSystemProperty} 条件装配
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
public class ConditionalOnSystemPropertyBootstrap {

    @ConditionalOnSystemProperty(name = "user.name", value = "Administrator")
    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ConditionalOnSystemPropertyBootstrap.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);
        System.out.println("ConditionalOnSystemPropertyBootstrap.main" + userDao.findBId(1));

        context.close();
    }
}
