package com.springboot.test1.server;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

import com.springboot.test1.bean.UserBean;

/**
 * 
 * @author 16400
 *
 */
@Service
public class UserServer {

	public UserBean add(UserBean bean) {
		
		return bean;
		
	}
	@PostConstruct
	public void init() {
		System.out.println("UserBean对象被创建");
	}
	@PreDestroy
	public void clean() {
		System.out.println("UserBean对象即将被销毁");
	}
}
