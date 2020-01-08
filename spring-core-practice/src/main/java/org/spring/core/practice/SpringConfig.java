package org.spring.core.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfig {

	@Bean
	public Employee getRavi() {
		return new Employee(1,"Ravi");
	}
	@Bean
	@Primary
	public Employee getSudhir() {
		return new Employee(2,"Sudhir");
	}
	
	
}
