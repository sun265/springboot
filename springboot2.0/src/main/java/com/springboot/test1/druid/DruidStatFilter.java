package com.springboot.test1.druid;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

@WebFilter(filterName="druieWebStatFilter",
urlPatterns="/*",  
initParams={  
    @WebInitParam(name="exclusions",
    		value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*"),// 忽略资源  
})
public class DruidStatFilter extends WebStatFilter{

}
