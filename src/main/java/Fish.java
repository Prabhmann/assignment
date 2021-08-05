import perform.impl.Swim;

public class Fish extends Animal {

  public Fish(){
    swimBehaviour = new Swim();
  }
  @Override
  public String performSound(){
    return "FISH SOUND";
  }

}
