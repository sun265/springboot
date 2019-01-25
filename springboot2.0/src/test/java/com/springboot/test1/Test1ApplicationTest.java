package com.springboot.test1;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author 16400
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1ApplicationTest {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private ObjectMapper mapper;

	/**
	 * 使用jackson树遍历获取json中的属性值
	 * @throws Throwable
	 */
	@Test
	@GetMapping
	@ResponseBody
	public void ReadTree() throws Throwable {
		String json = "{\"name\":\"slm\",\"id\":2}";
		JsonNode node = mapper.readTree(json);
        String name = node.get("name").asText();
        int id = node.get("id").asInt();       
		System.out.println( "name:"+name+"id:"+id);
	}
}
