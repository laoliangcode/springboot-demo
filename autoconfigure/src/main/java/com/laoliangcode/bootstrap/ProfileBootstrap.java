package com.laoliangcode.bootstrap;

import com.laoliangcode.configuration.UserProfileConfiguration;
import com.laoliangcode.dao.IUserDao;
import com.laoliangcode.service.UserServiceForProfile;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;

/**
 * 根据{@link Profile} 的不同，引入不同的{@link IUserDao}
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
public class ProfileBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext();
        context.register(UserProfileConfiguration.class);
        context.getEnvironment().setActiveProfiles("oracle");
        context.refresh();

        UserServiceForProfile userService = context.getBean("userServiceForProfile",
                UserServiceForProfile.class);
        System.out.println("ProfileBootstrap.main" + userService.findBId(1));

        context.close();
    }
}
