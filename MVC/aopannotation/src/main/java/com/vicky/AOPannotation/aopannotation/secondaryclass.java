package com.vicky.AOPannotation.aopannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class secondaryclass {
	@Before("execution(* com.vicky.AOPannotation.aopannotation.primaryclass.*(..))")
	public void execBefore(JoinPoint jointpoint)
	{
		System.out.println("method invoked befor class");
	}
	@After("execution(* com.vicky.AOPannotation.aopannotation.primaryclass.*(..))")
	public void execAfter(JoinPoint joinpoint)
	{
		System.out.println("method invode after class");
	}

}
