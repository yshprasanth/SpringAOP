package com.sai.sri.siddhi.aop.annot.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Yalamanchili on 03/08/2017.
 */
@Aspect
public class Logging {

    private Logger logger = LogManager.getLogger(getClass());

    @Pointcut("execution(* com.sai.sri.siddhi.aop.annot.pojo.Student.*(..))")
    private void selectAll() {}

    @Before("selectAll()")
    public void beforeAdvice() {
        logger.info("Before Advice..");
    }

    @After("selectAll()")
    public void afterAdvice() {
        logger.info("After Advice..");
    }

    @AfterReturning(value = "selectAll()", returning = "retVal1")
    public void afterReturningAdvice(JoinPoint jp, Object retVal1) {
        logger.info("After Returning Advice..");
        logger.info("Method Signature: " + jp.getSignature());
        logger.info("return value: " + retVal1);
    }

    @AfterThrowing(value = "selectAll()", throwing = "error")
    public void afterThrowingAdvice(JoinPoint jp, Throwable error) {
        logger.info("After Throwing Advice..");
        logger.info("Method Signature: " + jp.getSignature());
        logger.info("throwing error: " + error);
    }

    @Around("selectAll()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        logger.info("Around Advice starting..");
        Object[] args = proceedingJoinPoint.getArgs();

        if(args.length>0) {
            int index = 0;
            for(Object arg: args) {
                logger.info("Args[" + index++ + "]: " + arg);
            }
        }

        Object retVal = null;
        try {
            retVal = proceedingJoinPoint.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("Ret Value: " + retVal);

        logger.info("Around Advice end..");
        return retVal;
    }
}
