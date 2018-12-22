package com.laoliangcode.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/22
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {
    /**
     * 系统属性名称
     * @return
     */
    String name();

    /**
     * 系统属性值
     * @return
     */
    String value();
}
