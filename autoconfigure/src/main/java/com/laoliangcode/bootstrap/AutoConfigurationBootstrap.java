package com.laoliangcode.bootstrap;

import com.laoliangcode.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@link EnableAutoConfiguration} 自动装配
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
@EnableAutoConfiguration
public class AutoConfigurationBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(AutoConfigurationBootstrap.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("AutoConfigurationBootstrap.main" + userService.findBId(1));

        context.close();
    }
}
