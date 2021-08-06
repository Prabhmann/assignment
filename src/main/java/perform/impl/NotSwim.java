package perform.impl;

import perform.SwimI;

public class NotSwim implements SwimI {

  @Override
  public String swim() {
    return "I can't swim";
  }
}