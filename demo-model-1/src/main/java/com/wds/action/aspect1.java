package com.wds.action;

import org.aspectj.lang.ProceedingJoinPoint;

public class aspect1 {

    public void before(){
        System.out.println("aspect1 方法前置");
    }

    public void afterReturning(){
        System.out.println("aspect1 方法后置");
    }

    public void after(){
        System.out.println("aspect1 最终执行方法");
    }

    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aspect1 环绕方法前置");

        pjp.proceed();

        System.out.println("aspect1 环绕方法后置");

    }
}
