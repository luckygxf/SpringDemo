package com.gxf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

/**
 * Created by 58 on 2017/12/28.
 */
@Service
@Aspect
public class TimeMonitor {

    @Around("execution(* com.gxf.aop.HelloAOPImpl.sayHello())")
    public void monitorAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("method start time: " + System.currentTimeMillis());
        Object object = proceedingJoinPoint.proceed();
        System.out.println("method end time: " + System.currentTimeMillis());
    }
}
