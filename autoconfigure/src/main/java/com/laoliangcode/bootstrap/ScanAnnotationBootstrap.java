package com.laoliangcode.bootstrap;

import com.laoliangcode.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * {@link ComponentScan} 注解方式配置扫描启动类
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
@ComponentScan(basePackages = "com.laoliangcode.service,com.laoliangcode.dao")
public class ScanAnnotationBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ScanAnnotationBootstrap.class);

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("ScanAnnotationBootstrap.main" + userService.findBId(1));

        context.close();
    }
}
