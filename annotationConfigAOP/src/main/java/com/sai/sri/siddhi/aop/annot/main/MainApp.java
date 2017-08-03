package com.sai.sri.siddhi.aop.annot.main;

import com.sai.sri.siddhi.aop.annot.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Yalamanchili on 03/08/2017.
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) appContext.getBean("student");
        student.getAge();
        student.getName();
        student.setAge(20);
        student.setName("Prasanth");
        student.throwException();
    }
}
