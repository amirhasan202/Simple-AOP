package com.in28minutes.learningAOP.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

	@Pointcut("execution(* com.in28minutes.learningAOP.*.*.*(..))")
	public void businessPackageConfig()	{}
	
	@Pointcut("@annotation(com.in28minutes.learningAOP.annotations.TrackTime)")
	public void trackTimeAnnotation() {}
	
}
