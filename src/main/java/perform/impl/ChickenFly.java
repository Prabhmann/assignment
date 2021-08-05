package perform.impl;

import perform.FlyableI;

public class ChickenFly implements FlyableI {

  @Override
  public Boolean fly() {
    System.out.println("I can't fly");
    return Boolean.FALSE;
  }
}
