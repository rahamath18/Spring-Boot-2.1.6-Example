package com.test.springboot216;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
//@EnableAutoConfiguration //  enable Spring Boot’s auto-configuration mechanism
@SpringBootApplication     //  enables all 3 [@EnableAutoConfiguration,  @ComponentScan, @Configuration]
public class SpringBoot_2_1_6_Example {
	
	@RequestMapping("/")
	String home() {
		return "My 1st example project on Spring Boot 2.1.6 !!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot_2_1_6_Example.class, args);
	}

}
