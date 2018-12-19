package com.springboot.learn.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value="classpath:demo.properties")
public class Server2 {

	@Value("${demo.title}")
	private String title;
	@Value("${demo.desc}")
	private String desc;
	@RequestMapping("/server2")
	public String server() {
		return title+"::"+desc;
	}
}
