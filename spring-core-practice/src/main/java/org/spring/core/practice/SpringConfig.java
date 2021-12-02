package org.spring.core.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

/*@Primary is just same as @Qualifier.
 * resolve the abmbiguity problem when multiple bean are there of same type
 * @Qualifier is used at the time of @Autowiring 
 * and @Primary annotation used in case if bean initialization. Its check the bean 
 * and get it the load the bean who is primary
 * */

@Configuration
public class SpringConfig {

	@Bean
	public Employee getRavi() {
		return new Employee(1, "Ravi");
	}
	@Bean
	@Primary
	public Employee getSudhir() {
		return new Employee(2,"Sudhir");
	}	
}
