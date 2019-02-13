package com.springboot.jpa.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entity.Users;

@Service
@Transactional
public class UserServer {

	@Autowired
	private UserRepository user;
	/**
	 * 查询
	 * @return
	 */
	public List<Users> findAll(){
		
		return user.findAll();
	}  
	/**
	 * 插入或更新
	 * @param users
	 */
	public void save(Users users) {
		
		user.save(users);
		
	}
	
}
