package com.springboot.test1.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test1.bean.User;
import com.springboot.test1.server.UserServer;

@RestController
public class BeetlTest {

	@Autowired
	private UserServer server;

	/*@RequestMapping(value = "add", method = RequestMethod.POST)
	String add(@RequestParam() String name, @RequestParam BigDecimal money) {

		User user = new User();
		user.setMoney(money);
		user.setName(name);
		try {
			server.insert(user);
			return "ok";
		} catch (Exception e) {
			return "fail";
		}

	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	String delete(@RequestParam int id) {
		
		try {
			server.deleteById(id);
			return "ok";
		} catch (Exception e) {
			return "fail";
		}
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	String update(@RequestParam int id) {
		
		try {
			server.updateById(id);
			return "ok";
		} catch (Exception e) {
			return "fail";
		}
		
	}
	
	@RequestMapping(value = "findall", method = RequestMethod.POST)
	List<User> findAll() {
		return server.findAll();
	}*/

}
