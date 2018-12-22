package com.laoliangcode.annotation;

import com.laoliangcode.configuration.UserConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 引入{@link UserConfiguration} {@link ImportSelector}
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
public class UserConfigurationSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {UserConfiguration.class.getName()};
    }
}
