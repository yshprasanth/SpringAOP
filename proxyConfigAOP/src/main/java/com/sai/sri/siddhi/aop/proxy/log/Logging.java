package com.sai.sri.siddhi.aop.proxy.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

    private Logger logger = LogManager.getLogger(getClass());

    @Pointcut("execution (* com.sai.sri.siddhi.aop.proxy.pojo.Student.*(..))")
    private void selectAll() {}

    @Before("selectAll()")
    public void beforeAdvice() {
        logger.info("beforeAdvice ..");
    }
}
