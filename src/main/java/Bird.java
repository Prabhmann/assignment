
import perform.FlyableI;
import perform.SingableI;


class Bird extends Animal implements SingableI {

  protected FlyableI flyBehaviour;

  @Override
  public String sing() {
    return "I am singing";
  }

  public Boolean performFly(){
    return flyBehaviour.fly();
  }
}