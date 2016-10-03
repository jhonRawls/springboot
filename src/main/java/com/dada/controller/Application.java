package com.dada.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@EnableAutoConfiguration // 标志在对应的主要class上
@Configuration
@ComponentScan //允许boot依据约定的规则对项目中的bean进行扫描
@EnableDiscoveryClient//注解来添加发现服务能力
public class Application {
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	 // 默认的main对应的class应该放在项目src代码的一级目录下,默认使用Applicati
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("web服务启动");
	}
}
