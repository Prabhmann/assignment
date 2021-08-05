
import perform.impl.ChickenFly;
import perform.impl.ChickenSound;

public class Chicken extends Bird  {

  public Chicken(){
    soundBehaviour= new ChickenSound();
    flyBehaviour = new ChickenFly();
  }

  @Override
  public String performSwim(){
    return "Unknown Behaviour";
  }
}
