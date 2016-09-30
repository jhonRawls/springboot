package com.dada.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@EnableAutoConfiguration // 标志在对应的主要class上
@Configuration
@ComponentScan //允许boot依据约定的规则对项目中的bean进行扫描
public class Application {
	 // 默认的main对应的class应该放在项目src代码的一级目录下,默认使用Applicati
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
