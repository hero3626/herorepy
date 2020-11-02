package com.joy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

   @Test
    public void test01(){
       String res="beans.xml";
       ApplicationContext ac=new ClassPathXmlApplicationContext(res);
       SomeService service =(SomeService)ac.getBean("someService");
       service.doSome(li,88);
       
   }


}
