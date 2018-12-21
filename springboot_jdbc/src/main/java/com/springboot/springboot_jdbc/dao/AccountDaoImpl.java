package com.springboot.springboot_jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springboot.springboot_jdbc.bean.Account;

@Component
public class AccountDaoImpl implements AccountDao{

	@Autowired
	private JdbcTemplate jdbc;
	@Override
	public int add(Account account) {
		// TODO Auto-generated method stub
		
		return jdbc.update("insert into account(name,money) values(?,?)",
				account.getName(),account.getMoney());
	}

	@Override
	public int update(Account account) {
		// TODO Auto-generated method stub
		return jdbc.update("update account set name=?,money=? where id=?",
				account.getName(),account.getMoney(),account.getId());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbc.update("delete from account where id=?",id);
	}

	@Override
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Account> list= jdbc.query("selete * from account where id=?",
				new Object[]{id}, new BeanPropertyRowMapper(Account.class));
		if(!list.isEmpty()) {
			Account account=list.get(0);
			return account;
		}
		else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> findAccountList() {
		// TODO Auto-generated method stub
	  @SuppressWarnings("rawtypes")
	List<Account>list=jdbc.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(Account.class));
		return list;
	}

}
