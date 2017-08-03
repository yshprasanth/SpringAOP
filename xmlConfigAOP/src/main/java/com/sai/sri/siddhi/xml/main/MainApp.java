package com.sai.sri.siddhi.xml.main;

import com.sai.sri.siddhi.xml.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Yalamanchili on 31/07/2017.
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Student student = (Student) appContext.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowsException();
    }
}
