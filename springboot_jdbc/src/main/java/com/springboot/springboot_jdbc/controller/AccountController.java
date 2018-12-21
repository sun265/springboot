package com.springboot.springboot_jdbc.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springboot_jdbc.bean.Account;
import com.springboot.springboot_jdbc.server.AccountServer;

@RequestMapping("jdbc")
@RestController
public class AccountController {

	@Autowired
	private AccountServer server;
	
	@RequestMapping("add")
	public int add(@PathParam("name") String name,
			@PathParam("money")double money
			) {
		Account account= new Account();
		account.setName(name);
		account.setMoney(money);
		return server.add(account);
	}
	@RequestMapping("update")
	public int update(@PathParam("name") String name,
			@PathParam("money")double money,
			@PathParam("id") int id) {
		Account account= new Account();
		account.setId(id);
		account.setMoney(money);
		account.setName(name);
		return server.update(account);
	}
	@RequestMapping("delete")
	public int delete(@PathParam("id") int id) {
		return server.delete(id);
	}
	@RequestMapping("find")
	public Account findbyid(@PathParam("id") int id) {
		return server.findAccountById(id);
	}
	@RequestMapping("list")
	public List<Account> find(){
		return server.findAccountList();
	}
}
