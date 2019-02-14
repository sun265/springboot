package com.springboot.jpa.server;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entity.Users;

@Service
@Transactional
public class UserServer {

	@Autowired
	private UserRepository user;
	/**
	 * 查询
	 * @return
	 */
	public List<Users> findAll(){
		
		return user.findAll();
	}  
	/**
	 * 插入或更新
	 * @param users
	 */
	public Users save(Users users) {
		user.save(users);
		return users;
	}
	
	public Users findById(int id) {

       return user.findById(id);
	}
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	public Boolean delete(int id) {
		
		try {
			user.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
			}
}
