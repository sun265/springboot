package com.springboot.learn.demo2.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.learn.demo2.bean.AccountBean;
import com.springboot.learn.demo2.dao.AccountDao;

@Service
public class AccountServer {

	@Autowired
	private AccountDao dao;
	
	public int add(AccountBean bean) {
		return dao.add(bean);
	}
	
	public int update(AccountBean bean) {
		return dao.update(bean);
	}
	
	public int delete(int id) {
		return dao.delete(id);
	}
	
	public AccountBean findAccountById(int id) {
		return dao.findAccountById(id);
	}
	
	public List<AccountBean> findAccountList(){
		return dao.findAccountList();
	}
	
}
