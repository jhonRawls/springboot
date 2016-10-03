package com.dada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController  
@EnableAutoConfiguration // 允许自动加载配置，Boot要采用一种特定的方式来对应用进行配置
public class UserLoginController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "hello world";
	}

/*	public static void main(String[] args) {
		SpringApplication.run(UserLoginController.class, args);
	}*/
	
	@Autowired
    RestTemplate restTemplate;
	
	 @RequestMapping(value = "/add", method = RequestMethod.GET)
	    public String add() {
	        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
	    }

}
