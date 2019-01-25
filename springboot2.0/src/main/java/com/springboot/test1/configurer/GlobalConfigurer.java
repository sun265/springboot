package com.springboot.test1.configurer;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * @author 16400
 *
 */
public class GlobalConfigurer implements WebMvcConfigurer{

	/**
	 * 拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(null).addPathPatterns("/index");
	}
	
}
