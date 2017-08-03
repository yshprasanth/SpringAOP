package com.sai.sri.siddhi.xml.pojo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Yalamanchili on 31/07/2017.
 */
public class Student {

    static Logger logger = LogManager.getLogger(Student.class);
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        logger.info("setAge: " + age);
        this.age = age;
    }

    public void setName(String name) {
        logger.info("setName: " + name);
        this.name = name;
    }

    public Integer getAge() {
        logger.info("getAge: " + age);
        return age;
    }

    public String getName() {
        logger.info("getName: " + name);
        return name;
    }

    public void printThrowsException() throws IllegalArgumentException {
        logger.info("Inside printThrowsException() ..");
        throw new IllegalArgumentException();

    }
}
