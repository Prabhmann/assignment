import perform.SoundI;
import perform.SwimI;
import perform.WalkI;
import perform.impl.NotSwim;
import perform.impl.Walk;

public class Animal {

  public SoundI soundBehaviour;

  protected SwimI swimBehaviour;

  protected WalkI walkBehaviour;

  public Animal(){
    this.walkBehaviour = new Walk();
    this.swimBehaviour = new NotSwim();
  }
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

  public String walk() {
    return this.walkBehaviour.walk();
  }
}
