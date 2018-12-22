package com.laoliangcode.configuration;

import com.laoliangcode.annotation.EnableUserSelector;
import com.laoliangcode.condition.ConditionalOnSystemProperty;

/**
 * user模块自动装配
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/22
 */
@EnableUserSelector
@ConditionalOnSystemProperty(name = "user.name", value = "Administrator")
public class UserAutoConfiguration {
}
