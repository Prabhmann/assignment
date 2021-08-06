package perform.impl;

import perform.SoundI;

public class NoSound implements SoundI {

  @Override
  public String sound() {
    return "No Sound";
  }
}
