package com.laoliangcode.annotation;

import com.laoliangcode.model.User;
import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * {@link User} {@link Repository}
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface UserRepository {

    String value() default "";
}
