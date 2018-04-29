package com.hh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
//        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
//        Question question=(Question)context.getBean("question");
//        question.displayInfo();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.displayInfo();

    }

}
