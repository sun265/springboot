package com.springboot.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springboot.jpa.entity.Users;
import com.springboot.jpa.server.UserServer;

@Controller
public class UsersController {

	@Autowired
	private UserServer server;
	/**
	 * 首页
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String mainIndex(Model model) {
		List<Users> list = server.findAll();
		model.addAttribute("users", list);
		return "user/list";
	}
	
	@RequestMapping("Add")
	public String add() {
		
		return "user/userAdd";
	}
	/**
	 * 添加
	 * @param users
	 * @return
	 */
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(Users users) {
		
		server.save(users);
		return "redirect:index";
	}
	/**
	 * 修改
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("Edit")
	public String edit(Model model,int id) {
		System.out.println("=========id==========="+id);
		Users user = server.findById(id);
		model.addAttribute("user", user);
		return "user/userEdit";
	}
	@RequestMapping(value="edit",method=RequestMethod.POST)
	public String edit(Users user) {
		System.out.println("id::::"+user.getId());
        server.save(user);
        return  "redirect:index";
        
	}
	@RequestMapping("delete")
	public String delete(int id) {
		
		Boolean flag = server.delete(id);
		
		if(flag) {
			return "redirect:index";
		}
		else {
			return "error";
		}
		
	}
}
