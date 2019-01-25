package com.springboot.test1.configurer;

import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author 16400
 *
 */
@Configuration
public class JacksonConfig {

	@Bean
	public ObjectMapper getObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"));		
		return mapper;
		}
	@PostConstruct
	public void init() {
		System.out.println("jacksonconfig初始化");
	}
}
