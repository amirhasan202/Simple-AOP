package com.in28minutes.learningAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Configuration
//AOP

@Configuration
@Aspect
public class LoggingAspect 
{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//PointCut-when
	// execution(* PACKAGE.*.*(..))
	@Before("com.in28minutes.learningAOP.aspect.CommonPointcutConfig.businessPackageConfig()")
	public void logMethodCall(JoinPoint joinPoint)
	{
		logger.info("Before Aspect -Method is called - {}" , joinPoint);
	}
}
