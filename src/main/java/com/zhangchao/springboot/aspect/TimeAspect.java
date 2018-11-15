package com.zhangchao.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 〈springboot配置aop〉
 *
 * @author 22902
 * @create 2018/11/13
 */
@Component
@Aspect
public class TimeAspect {
    @Around("execution(* com.zhangchao.springboot.controller..*(..))")
    public Object timeMethod(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("===========================Aspect处理 - start ==========================");
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("参数： "+arg);
        }
        long startTime = System.currentTimeMillis();
        Object o = joinPoint.proceed();
        System.out.println("aop耗时 "+(System.currentTimeMillis()-startTime));
        System.out.println("===========================Aspect处理 - end =============================");
        return o;
    }

}
