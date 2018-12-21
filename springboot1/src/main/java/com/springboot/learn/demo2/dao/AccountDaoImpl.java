package com.springboot.learn.demo2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springboot.learn.demo2.bean.AccountBean;

@Component
public class AccountDaoImpl implements AccountDao{

	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int add(AccountBean bean) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into account(name,money) values(?,?)",bean.getName(),bean.getMoney());
	}

	@Override
	public int update(AccountBean bean) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update account set name=?,money=? where id=?",
				bean.getName(),bean.getMoney(),bean.getId());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from account where id=?",id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public AccountBean findAccountById(int id) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		List<AccountBean> list = jdbcTemplate.query("select * from account where id=?",new Object[]{id}, new BeanPropertyRowMapper(AccountBean.class));
		if(list!=null&&list.size()>0) {
			AccountBean bean = list.get(0);
			return bean;
		}
		else {
		return null;
		}
	}

	@Override
	public List<AccountBean> findAccountList() {
		 List<AccountBean> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(AccountBean.class));
	        if(list!=null && list.size()>0){
	            return list;
	        }else{
	            return null;
	        }
	    }
	}


