package com.ds.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);

    //AOP expression for which methods shall be intercepted
    @Around("execution(* com.ds.services..*(..)))")
    public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        //Get intercepted method details
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        final StopWatch stopWatch = new StopWatch();

        //Measure method execution time
        stopWatch.start();
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();

        //Log method execution time
        LOGGER.info("Execution time of " + className + "." + methodName + " :: " + stopWatch.getTotalTimeMillis() + " ms");

        return result;
    }

    @Before("execution(* com.ds..*(..)))")
    public void justLog(JoinPoint joinPoint)
    {

        final StopWatch stopWatch = new StopWatch();
        //Measure method execution time
        stopWatch.start();

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        //Get intercepted method details
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        Object[] signatureArgs = joinPoint.getArgs();
        for (Object signatureArg: signatureArgs) {
            LOGGER.info("Arg: " + signatureArg);
        }

        stopWatch.stop();

        //Log method execution time
        LOGGER.info("Execution time of " + className + "." + methodName + " :: " + stopWatch.getTotalTimeMillis() + " ms");
    }

    @Around("@annotation(com.ds.annotations.LogExecutionTime)")
    //@Around("@annotation(com.in28minutes.springboot.tutorial.basics.example.aop.TrackTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("Custom annotation listener");

        final StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        Object proceed = joinPoint.proceed();

        stopWatch.stop();

        LOGGER.info(joinPoint.getSignature() + " executed in " + stopWatch.getTotalTimeMillis() + "ms");
        return proceed;
    }
}
