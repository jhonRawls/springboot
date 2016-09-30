package com.dada.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class WebController {
	 @RequestMapping("/")  
	    public String web(Map<String,Object> model){  
	        model.put("time",new Date());  
	        model.put("message","hello world");  
	        return "web";//返回的内容就是templetes下面文件的名称  
	    }  
}
