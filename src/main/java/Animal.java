import perform.SoundI;
import perform.SwimI;

public class Animal {

  public SoundI soundBehaviour;

  protected SwimI swimBehaviour;

  public String performSwim(){
    return swimBehaviour.swim();
  }

  public String performSound(){
    return soundBehaviour.sound();
  }

  protected SoundI getSoundBehaviour() {
    return soundBehaviour;
  }

  public void setSoundBehaviour(SoundI soundBehaviour) {
    this.soundBehaviour = soundBehaviour;
  }

  String walk() {
    return "I am walking";
  }
}
