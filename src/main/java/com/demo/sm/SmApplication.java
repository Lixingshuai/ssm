package com.demo.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.sm.mapper")
public class SmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmApplication.class, args);
	}

}
