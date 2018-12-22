package com.laoliangcode.bootstrap;

import com.laoliangcode.model.User;
import com.laoliangcode.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XML方式配置扫描启动类
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
public class ScanXmlBootstrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scan-xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("ScanXmlBootstrap.main" + userService.findBId(1));

        context.close();
    }
}
