package com.springboot.test1.server;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.test1.bean.User;
import com.springboot.test1.dao.userDao;

/**
 * 
 * @author 16400
 *
 */
@Service
@Transactional
public class UserServer {

	@Autowired
	private userDao dao;

	/*public void insert(User user) {
		dao.insert(user);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

	public void updateById(int id) {
		dao.updateById(id);
	}

	public List<User> findAll() {

		return dao.findAll();
	}
*/
	@PostConstruct
	public void init() {
		System.out.println("UserBean对象被创建");
	}

	@PreDestroy
	public void clean() {
		System.out.println("UserBean对象即将被销毁");
	}
}
