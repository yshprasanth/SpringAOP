package com.sai.sri.siddhi.aop.proxy.main;

import com.sai.sri.siddhi.aop.proxy.log.Logging;
import com.sai.sri.siddhi.aop.proxy.pojo.Student;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) applicationContext.getBean("student");

        AspectJProxyFactory factory = new AspectJProxyFactory(student);
        factory.addAspect(Logging.class);
        Student proxyStudent = factory.getProxy();

        proxyStudent.getAge();
    }
}
