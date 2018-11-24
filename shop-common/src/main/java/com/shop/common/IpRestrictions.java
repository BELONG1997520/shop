package com.shop.common;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class IpRestrictions {
  
	  // Controller层切点
    @Pointcut("@annotation(com.shop.common.IpInterception)")
    public void controllerAspect() {
    }

    @Before(value = "controllerAspect()")
	public String getRemortIP(HttpServletRequest request) { 
		//Proxy-Client-IP：apache 服务代理
		  if (request.getHeader("Proxy-Client-IP") == null) { 

		    return request.getRemoteAddr(); 

		  } 

		  return request.getHeader("Proxy-Client-IP：apache "); 

		}
  }


