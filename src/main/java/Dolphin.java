import perform.SwimI;
import perform.impl.Swim;

public class Dolphin  {

  protected SwimI swimBehaviour;

  public Dolphin(){
    this.swimBehaviour = new Swim();
  }

  public String performSwim(){
    return swimBehaviour.swim();
  }
}
