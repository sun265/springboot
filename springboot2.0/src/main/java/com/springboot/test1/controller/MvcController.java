package com.springboot.test1.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.test1.bean.User;
import com.springboot.test1.server.UserServer;

/**
 * 
 * @author 16400
 *
 */
@Controller
public class MvcController {
	
	@Autowired
	private UserServer user;
	@RequestMapping("add")
	public String add(@RequestParam int userId,@RequestParam String userName,Model model) {
		User bean = new User();
		bean.setId(userId);
		bean.setName(userName);
		//user.add(bean);
		model.addAttribute("userId",userId);
		model.addAttribute("userName",userName);
		return "index";
	}
	@RequestMapping("index")
	public String index() {
		return "index2";
	}
	/**
	 * 接收表单提交的数据
	 * @param bean
	 * @return
	 */
	@RequestMapping(value="json_add",method=RequestMethod.POST)
	@ResponseBody
	public void add1(User bean) {		
		System.out.println(bean.toString());
		//user.add(bean);		
	}
	@SuppressWarnings("deprecation")
	@RequestMapping("now")
	@ResponseBody
	public Map<String, Date> nowTime() {
		
		Map<String, Date> map = new HashMap<String, Date>();
		map.put("date", new Date("Sat Jan 19 18:06:35 CST 2019"));
		return map;
	}
}
