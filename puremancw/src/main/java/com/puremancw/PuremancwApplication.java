package com.puremancw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.puremancw.mapper")
public class PuremancwApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuremancwApplication.class, args);
	}
}
