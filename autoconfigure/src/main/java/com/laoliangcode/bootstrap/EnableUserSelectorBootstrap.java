package com.laoliangcode.bootstrap;

import com.laoliangcode.annotation.EnableUserConfig;
import com.laoliangcode.annotation.EnableUserSelector;
import com.laoliangcode.model.User;
import com.laoliangcode.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@link EnableUserSelector} 接口方式引入{@link User}模块启动类
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
@EnableUserSelector
public class EnableUserSelectorBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(EnableUserSelectorBootstrap.class);

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("EnableUserSelectorBootstrap.main" + userService.findBId(1));

        context.close();
    }
}
