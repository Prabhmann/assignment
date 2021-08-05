package perform.impl;

import perform.SoundI;

public class CatSound implements SoundI {

  @Override
  public String sound() {
    return "Meow";
  }
}
