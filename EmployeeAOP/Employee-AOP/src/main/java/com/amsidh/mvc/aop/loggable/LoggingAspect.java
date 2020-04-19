package com.amsidh.mvc.aop.loggable;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspect {

	public LoggingAspect() {
		System.out.println("Logging Aspect is initilized...!");
	}
	
	@Before("beforePointCut()")
	public void logBefore(JoinPoint joinPoint) {
 
		System.out.println("Class Name: "+joinPoint.getTarget()+" and Method Name: "+joinPoint.getSignature().getName());
		
	}
	
	@Pointcut("execution(* com.amsidh..*.*(..))")
	public void beforePointCut()
	{
		
	}
}
