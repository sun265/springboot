package com.springboot.learn.demo2.dao;

import java.util.List;

import com.springboot.learn.demo2.bean.AccountBean;

public interface AccountDao {

	int add(AccountBean bean);
	int update(AccountBean bean);
	int delete(int id);
	AccountBean findAccountById(int id);
	List<AccountBean> findAccountList();
}
