package com.revature.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.services.MovieService;

@Aspect
@Component
public class MovieAspect {
	@AfterReturning(pointcut="execution(* watch*(..))")
	public void afterEntering(JoinPoint jp) throws Exception {
		MovieService ms = (MovieService) jp.getTarget();
		if (ms.getIsOpen()) {
			ms.applaud();
		} else {
			ms.boo();
		}
	}
	
	@Before("execution(* com.revature.services.MovieService.watchMovie(..))")
	public void beforeWatching() {
		System.out.println("Buy popcorn");
	}
	
	@AfterThrowing("execution(* com.revature.services.MovieService.watchMovie(..))")
	public void boo() {
		System.out.println("It was awful");
	}
	
	@Around("execution(* com.revature.services.MovieService.watchMovie(..))")
	public void useRestroom(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Using restroom before movie");
		jp.proceed();
		System.out.println("Using restroom after movie");
	}
}
