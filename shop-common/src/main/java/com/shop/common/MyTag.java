package com.shop.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//TODO 类名不规范 根据需求IP拦截相关 起名字
public @interface MyTag {
    //名字age规定无任何用处
    int age() default 0;
}
