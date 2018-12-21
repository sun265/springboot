package com.springboot.jpa.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
@Table  标注类对应的表
* 若表名和类型相同时，省略@Table,比如类Users 和表 users;
* 若不相同时，必须有@Table，并设置name,为该类对应的表名。@Table(name="users")
* 
* @Entity 标注实体
* 
* @Id 标注id
* 
* @Transient 标注该属性不做与表的映射(原因：可能表中没有该属性对应的字段)
* 有该注解，在执行sql语句时，就不会出现该属性，否则会有，若表中没有该字段则会报错
* 
* @Basic 默认所有属性都有该注解(主键需要单独使用@Id)，所以可以省略
* 		    该注解可以放在属性上，也可以放在对应的getter方法上。
* 		     注意：要么统一将@Basic放在属性上，要么统一放在对应的getter方法上。（一般都放在属性上，可读性比较好）
* 
* @Column 类中属性名和表中对应字段名不相同时，会使用该注解，指明在类中对应的字段
* 			@Column(name="对应的表中字段名")
*/

@Table(name="account")
@Entity
public class Account {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="money")
	private double money;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
}
