package com.springboot.learn.demo2.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learn.demo2.bean.AccountBean;
import com.springboot.learn.demo2.server.AccountServer;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
    private AccountServer server;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public int add(@RequestParam("name") String name,
			@RequestParam("money") double money) {
		AccountBean bean = new AccountBean();
		bean.setName(name);
		bean.setMoney(money);
		return server.add(bean);		
	}
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public int update(@PathParam("id")int id,
			@RequestParam("name")String name,
			@RequestParam("money")double money) {
		AccountBean bean = new AccountBean();
		bean.setId(id);
		bean.setMoney(money);
		bean.setName(name);
		return server.update(bean);		
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public int delete(@RequestParam("id")int id) {
		return server.delete(id);
	}
	@RequestMapping(value="/find")
	public AccountBean findAccountById(@PathParam("id") int id) {
		return server.findAccountById(id);
	}
	@RequestMapping(value="/list")
	public List<AccountBean> findAccountList(){
		return server.findAccountList();
	}
	
 
}
