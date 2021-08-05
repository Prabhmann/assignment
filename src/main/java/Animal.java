import perform.SoundI;

public class Animal {

  public SoundI soundBehaviour;

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
