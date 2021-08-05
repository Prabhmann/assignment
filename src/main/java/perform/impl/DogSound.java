package perform.impl;

import perform.SoundI;

public class DogSound implements SoundI {

  @Override
  public String sound() {
    return "Woof, woof";
  }
}
