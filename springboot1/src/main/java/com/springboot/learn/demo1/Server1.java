package com.springboot.learn.demo1;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 两种方式获取配置文件中的属性
 * 1、value
 * 2、bean
 * @author 16400
 *
 */
@Controller
@RequestMapping("/slm")
public class Server1 {

	/*@Value("${demo.title}")
	private String title;
	@Value("${demo.desc}")
	private String desc;*/
	@Autowired
	private demoBean bean;
	@RequestMapping("/demo")
	@ResponseBody
	public String captch() {
		return bean.getTitle()+"--"+bean.getDesc();
		//return title+desc;
	}
}
