package com.sai.sri.siddhi.aop.annot.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Yalamanchili on 03/08/2017.
 */
@Aspect
public class Logging {

    Logger logger = LogManager.getLogger(getClass());

    @Pointcut("execution(* com.tutorialspoint.*.*(..))")
    private void selectAll() {}

    @Before("selectAll()")
    public void beforeAdvice() {
        logger.info("Before Advice..");
    }
}
