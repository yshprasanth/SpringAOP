package com.sai.sri.siddhi.aop.xml.log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Optional;

/**
 * Created by Yalamanchili on 31/07/2017.
 */
public class Logging {

    static Logger logger = LogManager.getLogger(Logging.class);

    public void beforeAdvice() {
        logger.info("Going to setup student profile !!");
    }

    public void afterAdvice() {
        logger.info("Student profile has been setup !!");
    }

    public Object aroundAdvice(ProceedingJoinPoint pjp) {
        logger.info("Start of aroundAdvice !!");
        Object[] args = pjp.getArgs();
        if(args.length>0) {
            logger.info("Arguments Passed: ");
            int index = 0;
            for(Object value: args) {
                logger.info("args[" + index + "]: " + value);
                index++;
            }
        }

        Object result = null;
        try {
            result = pjp.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        logger.info("Returning result: " + result);

        return result;
    }

    public void afterReturningAdvice(Object retVal1) {
        logger.info("Returning: " + Optional.ofNullable(retVal1));
    }

    public void afterThrowingAdvice(IllegalArgumentException exception) {
        logger.info("There has been an exception: " + exception.toString());
    }


}
