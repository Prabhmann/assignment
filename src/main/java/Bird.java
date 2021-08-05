
import perform.FlyableI;
import perform.SingableI;
import perform.SoundI;
import perform.SwimI;

class Bird extends Animal implements SingableI {

  public SoundI soundBehaviour;

  public FlyableI flyBehaviour;

  public SwimI swimBehaviour;

  @Override
  public void sing() {
    System.out.println("I am singing");
  }

  public String performSound(){
    return soundBehaviour.sound();
  }

  public String performSwim(){
    return swimBehaviour.swim();
  }

  public Boolean performFly(){
    return flyBehaviour.fly();
  }
}