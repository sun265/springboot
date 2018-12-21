package com.springboot.springboot_jdbc.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springboot_jdbc.bean.Account;
import com.springboot.springboot_jdbc.dao.AccountDao;

@Service
public class AccountServer {

	@Autowired
	private AccountDao dao;
	
	public int add(Account account) {
		
		return dao.add(account);
	}

	public int update(Account account) {
		return dao.update(account);
	}

	public int delete(int id) {
		return dao.delete(id);
	}

	public Account findAccountById(int id) {
		return dao.findAccountById(id);
	}

	public List<Account> findAccountList() {
		return dao.findAccountList();
	}
}
