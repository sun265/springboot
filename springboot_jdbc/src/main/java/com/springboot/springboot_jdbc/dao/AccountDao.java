package com.springboot.springboot_jdbc.dao;

import java.util.List;

import com.springboot.springboot_jdbc.bean.Account;

public interface AccountDao {

	int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
