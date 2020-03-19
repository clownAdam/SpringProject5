package com.itlike.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ProjectName: SpringProject5
 * @Package: com.itlike.aop
 * @ClassName: MyAspect
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/19 4:21
 * @Version: 1.0
 */
public class MyAspect {
    public void check(){
        System.out.println("权限校验");
    }
    public void log(Object res){
        System.out.println("日志记录"+res);
    }
    public Object arount(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("begin");
        Object proceed = joinPoint.proceed();
        System.out.println("end");
        return proceed;
    }

    public void execeptionNotice(Throwable ex){
        System.out.println("exeception run" +ex.getMessage());
    }

    public void after(){
        System.out.println("after");
    }
}
