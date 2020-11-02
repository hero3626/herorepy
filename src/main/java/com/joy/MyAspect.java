package com.joy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/*
*
*
* */
@Aspect

public class MyAspect {
@Before(value = "execution(public void com.joy.impl.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        System.out.println("切面方法：再执行之前输出时间",+new Date());
    }

}
