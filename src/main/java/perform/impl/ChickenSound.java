package perform.impl;

import perform.SoundI;

public class ChickenSound implements SoundI {

  @Override
  public String sound() {
    return "Cluck, cluck";
  }
}
