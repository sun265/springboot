package com.springboot.springboot_jdbc.filter;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

@WebServlet(urlPatterns = "/druid/*", initParams = { 
		@WebInitParam(name = "allow", value = ""),
		@WebInitParam(name = "deny", value = "192.168.16.111"), // IP黑名单 (存在共同时，deny优先于allow)
		@WebInitParam(name = "loginUsername", value = "admin"), // 用户名
		@WebInitParam(name = "loginPassword", value = "admin"), // 密码
		@WebInitParam(name = "resetEnable", value = "true")// 禁用HTML页面上的“Reset All”功能
})
public class DruidStatViewServlet extends StatViewServlet {
	private static final long serialVersionUID = 2359758657306626394L;

}