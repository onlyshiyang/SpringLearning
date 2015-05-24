package com.yangsh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.yangsh.common.icf.Performer;

public class MainApp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ApplicationContext ctx ;
    //ctx = new FileSystemXmlApplicationContext("C:\\Workspace\\GitHome\\SpringLearning\\src\\main\\resources\\springlearning.xml");
    ctx = new ClassPathXmlApplicationContext("springlearning.xml");
    
    Performer performer = (Performer)ctx.getBean("duke");
    performer.perform();
    System.out.println(performer.toString());
    
    performer = (Performer)ctx.getBean("duke");
    performer.perform();
    System.out.println(performer.toString());
  }

}
