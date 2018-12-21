package com.springboot.jpa.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.bean.Account;
import com.springboot.jpa.server.AccountServer;

@RestController
@RequestMapping("/jpa")
public class AccountController {

	@Autowired
	private AccountServer server;

	@RequestMapping("add")
	public String add(@PathParam("name")String name,
			@PathParam("money")double money) {
		Account account = new Account();
		account.setName(name);
		account.setMoney(money);
		Account account1=server.add(account);
		return account1.toString();
	}

	@RequestMapping("update")
	public String update(@PathParam("name")String name,
			@PathParam("money")double money,
			@PathParam("id") int id) {
		Account account = new Account();
		account.setName(name);
		account.setMoney(money);
		account.setId(id);
		Account account1=server.update(account);
		return account1.toString();
	}

	@RequestMapping("delete")
	public void delete(@PathParam("id")int id) {
		server.delete(id);
	}

	@RequestMapping("findall")
	public List<Account> findAll() {
		
		return server.findAll();
	}
}
