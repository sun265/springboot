package com.springboot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.entity.Users;
import com.springboot.jpa.server.UserServer;

@RestController
public class UsersController {

	@Autowired
	private UserServer server;
	
	@RequestMapping("findall")
	public List<Users> findAll(){
		
		return server.findAll();
	}
	@RequestMapping("save")
	public Users saveUser(Users user) {
		
		server.save(user);
		return user;
		
	}
}
