package com.sai.sri.siddhi.aop.proxy.pojo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Student {

    Logger logger = LogManager.getLogger(getClass());
    private int age;
    private String name;

    public int getAge() {
        logger.info("getAge: " + age);
        return age;
    }

    public void setAge(int age) {
        logger.info("setAge: " + age);
        this.age = age;
    }

    public String getName() {
        logger.info("getName: " + name);
        return name;
    }

    public void setName(String name) {
        logger.info("setName: " + name);
        this.name = name;
    }

    public void throwsException() {
        logger.info("throwsException ..");
        throw new IllegalArgumentException();
    }


}
