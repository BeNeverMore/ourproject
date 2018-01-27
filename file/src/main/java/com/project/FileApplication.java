package com.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.project.dao")
public class FileApplication {
	public static void main(String[] args) {
		SpringApplication.run(FileApplication.class, args);
	}
}
