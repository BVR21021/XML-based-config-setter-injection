package com.venky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
        EmployeeBean ab=(EmployeeBean)ctx.getBean("Sb");
       String s= ab.toString();
       System.out.println(s);
    }
}
