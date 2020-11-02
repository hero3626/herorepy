package com.joy.impl;

import com.joy.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age){
        System.out.println("SomeServiceImpl中doSome（）执行");
    }
}
