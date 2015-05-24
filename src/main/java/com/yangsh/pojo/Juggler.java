package com.yangsh.pojo;

import com.yangsh.common.icf.Performer;

public class Juggler implements Performer {
  
  private int beanBags = 3;
  
  public Juggler(){
    
  }
  
  public Juggler(int size){
    this.beanBags = size;
  }

  @Override
  public void perform() {
    System.out.println("JUGGLING " + beanBags + " BEANBAGS");
  }

}
