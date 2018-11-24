package com.shop.common;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class IpRestrictions {

    @Autowired
    private HttpServletRequest httpServletRequest;

    // Controller层切点
    @Pointcut("@annotation(com.shop.common.IpInterception)")
    public void controllerAspect() {
    }

    @Before(value = "controllerAspect()")
    public void getRemortIP(JoinPoint joinPoint) {
        String ip = null;
        //Proxy-Client-IP：apache 服务代理
        if (httpServletRequest.getHeader("Proxy-Client-IP") == null) {

            ip = httpServletRequest.getRemoteAddr();

        }

        if (StringUtils.isEmpty(ip)) {
            ip = httpServletRequest.getHeader("Proxy-Client-IP：apache ");

        }
        if (!ip.equalsIgnoreCase("127.0.0.1")) {
            throw new RuntimeException("forbidden 403");
        }
    }
}


