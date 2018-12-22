package com.laoliangcode.annotation;

import com.laoliangcode.configuration.UserConfiguration;
import com.laoliangcode.model.User;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;

import java.lang.annotation.*;

/**
 * 使用{@link ImportSelector}方式导入{@link User} 模块配置类 {@link UserConfiguration}
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(UserConfigurationSelector.class)
public @interface EnableUserSelector {
}
