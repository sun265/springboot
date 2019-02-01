package com.springboot.test1.bean;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-01-28
*/
@Table(name="springboot.user")
public class User   {
	
	private Integer id ;
	private BigDecimal money ;
	private String name ;
	
	public User() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public BigDecimal getMoney(){
		return  money;
	}
	public void setMoney(BigDecimal money ){
		this.money = money;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	

}
