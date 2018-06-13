package com.springboot.xdd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.springboot.xdd.mapper")
public class XddApplication {
	public static void main(String[] args) {
		SpringApplication.run(XddApplication.class, args);
	}
}
