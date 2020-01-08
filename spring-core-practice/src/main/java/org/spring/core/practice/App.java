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
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee emp=(Employee) ctx.getBean(Employee.class);
        System.out.println(emp.sayHello());
    }
}
