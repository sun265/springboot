package com.springboot.test1.bean;

/**
 * 
 * @author 16400
 *
 */
public class UserBean {
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private String userName;
	private int userId;

}
