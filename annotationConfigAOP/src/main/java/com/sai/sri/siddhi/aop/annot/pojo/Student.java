package com.sai.sri.siddhi.aop.annot.pojo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Yalamanchili on 03/08/2017.
 */
public class Student {

    Logger logger = LogManager.getLogger(getClass());

    private Integer age;
    private String name;

    public Integer getAge() {
        logger.info("getAge: " + age);
        return age;
    }

    public void setAge(Integer age) {
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

    public void throwException() {
        logger.info("throwException..");
        throw new IllegalArgumentException();
    }
}
