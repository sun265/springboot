package com.springboot.test1.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

/**
 * 切面类，面向Controller类
 * @author 16400
 *
 */
@Configuration
@Aspect
public class ControllerAspect {

	/**
	 * Controller执行前、后，执行切面方法
	 * @param pj
	 * @return
	 * @throws Throwable
	 */
	@Around("@within(org.springframework.stereotype.Controller)")
	public Object simpleAop(final ProceedingJoinPoint pj) throws Throwable {
		
		try {			
			Object[] args= pj.getArgs();
			System.out.println("args"+Arrays.asList(args));
			/**
			 * pj.proceed()方法保证切面逻辑执行完毕后，返回正常逻辑进行执行
			 */
			
			Object o = pj.proceed();
		    System.out.println("return"+o);
		    return o;
		} catch (Throwable e) {
			throw e;
		}
	}
	
}
