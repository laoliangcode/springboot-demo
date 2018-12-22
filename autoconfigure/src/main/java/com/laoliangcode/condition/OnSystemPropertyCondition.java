package com.laoliangcode.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * 根据{@link Environment}的条件{@link Condition}实现
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/22
 */
public class OnSystemPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String propertyName = String.valueOf(annotationAttributes.get("name"));
        String propertyValue = String.valueOf(annotationAttributes.get("value"));
        String systemPropertyValue = System.getProperty(propertyName);

        return propertyValue.equals(systemPropertyValue);
    }
}
