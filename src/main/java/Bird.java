
import perform.FlyableI;
import perform.SingableI;

import perform.SwimI;

class Bird extends Animal implements SingableI {

  protected FlyableI flyBehaviour;

  protected SwimI swimBehaviour;

  @Override
  public String sing() {
    return "I am singing";
  }

  public String performSwim(){
    return swimBehaviour.swim();
  }

  public Boolean performFly(){
    return flyBehaviour.fly();
  }
}