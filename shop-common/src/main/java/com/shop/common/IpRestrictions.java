package com.shop.common;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class IpRestrictions {
  
	public String getRemortIP(HttpServletRequest request) { 

		  if (request.getHeader("x-forwarded-for") == null) { 

		    return request.getRemoteAddr(); 

		  } 

		  return request.getHeader("x-forwarded-for"); 

		}
  }


