package com.ds.designpatternsexamples.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.math.BigDecimal;

@Aspect
@Component
public class ReducerAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //AOP expression for which methods shall be intercepted
    @Around("execution(* com.ds.designpatternsexamples.lambdas..*(..)))")
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
        logger.info("Execution time of " + className + "." + methodName + " :: " + stopWatch.getTotalTimeMillis() + " ms");

        return result;
    }



    //@Before("execution(* com.ds.designpatternsexamples.lambdas.*.*(..))")
    //@Before("execution(* *.*.*(..))")
    public void before(JoinPoint joinPoint) {
        //Advice
        logger.info(" Check for user access ");
        logger.info(" Allowed execution for {}", joinPoint);

    }


    //@Pointcut("execution(public * *(..))")
    public void after() {
        logger.info("after execution of {}", "joinPoint");
    }

    @Before(value = "execution(* com.ds.designpatternsexamples.lambdas.Reducer.*(..)) and args(bigDecimal)")
    public void beforeAdvice(JoinPoint joinPoint, BigDecimal bigDecimal) {
        System.out.println("Before method:" + joinPoint.getSignature());

        System.out.println("Creating Employee with name - " + bigDecimal);
    }

    @Before("execution(* com.ds.designpatternsexamples.lambdas.*.*(..))")
    public void before2(JoinPoint joinPoint){
        //Advice
        logger.info(" Check for user access ");
        logger.info(" Allowed execution for {}", joinPoint);
    }

    //@After(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
    public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
        System.out.println("After method:" + joinPoint.getSignature());

        System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
    }
}
