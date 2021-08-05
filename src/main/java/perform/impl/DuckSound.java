package perform.impl;

import perform.SoundI;

public class DuckSound implements SoundI {

  @Override
  public String sound() {
    return "Quack Quack";
  }
}
