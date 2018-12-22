package com.laoliangcode.bootstrap;

import com.laoliangcode.annotation.EnableUserConfig;
import com.laoliangcode.model.User;
import com.laoliangcode.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@link EnableUserConfig} 注解方式引入{@link User}模块启动类
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
@EnableUserConfig
public class EnableUserConfigBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(EnableUserConfigBootstrap.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("EnableUserConfigBootstrap.main" + userService.findBId(1));

        context.close();
    }
}
