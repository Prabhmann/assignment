package perform.impl;

import perform.FlyableI;

public class Fly implements FlyableI {

  @Override
  public Boolean fly() {
   System.out.println("I can fly");
   return Boolean.TRUE;
  }
}
