package org.spring.core.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App
{
	
    public static void main( String[] args )
    {
    	
    	// XMl Approach
/*    	 ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
    	 Employee emp=(Employee) ctx.getBean("employee");
    	 System.out.println(emp.sayHello());
    	 Employee emp1=(Employee) ctx.getBean("employee");
    	 System.out.println(emp1.sayHello());
    	 Employee emp2=(Employee) ctx.getBean("employee");
    	 System.out.println(emp2.sayHello());
    	 */
    	
    	// @Annotation approach
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee emp=(Employee) ctx.getBean(Employee.class);
        System.out.println(emp.sayHello());
        
        Employee emp1=(Employee) ctx.getBean(Employee.class);
        System.out.println(emp1.sayHello());

        
    }
}
