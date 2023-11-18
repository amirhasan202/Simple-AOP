package com.in28minutes.learningAOP.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect
{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@Around("com.in28minutes.learningAOP.aspect.CommonPointcutConfig.trackTimeAnnotation()")
	public Object findExecutionTime (ProceedingJoinPoint joinPoint) throws Throwable
	{
		
		long startTime = System.currentTimeMillis();		
		
		Thread.sleep(30);
		
		Object proced = joinPoint.proceed();
		
		long stopTime = System.currentTimeMillis();
			
		long executionTime = stopTime - startTime ;
		
		logger.info("Around Aspect -{} executed in {} " ,proced , executionTime);
		
		return proced;
	}
}
