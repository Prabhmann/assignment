
import perform.impl.ChickenFly;
import perform.impl.ChickenSound;
import perform.impl.RoosterSound;

public class Chicken extends Bird  {

  public Chicken(){
    soundBehaviour= new ChickenSound();
    flyBehaviour = new ChickenFly();
  }

  public void setIsRooster(){
    soundBehaviour = new RoosterSound();
  }

  @Override
  public String performSwim(){
    return "Unknown Behaviour";
  }
}
