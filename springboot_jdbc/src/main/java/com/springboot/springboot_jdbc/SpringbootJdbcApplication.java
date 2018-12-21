package com.springboot.springboot_jdbc;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import com.alibaba.druid.pool.DruidDataSource;

@ServletComponentScan//这行是为了避免扫描不到Druid的Servlet  
@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcApplication.class, args);
	}
	@Bean("duridDatasource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource druidDataSource() { 
		return new DruidDataSource(); }

}

