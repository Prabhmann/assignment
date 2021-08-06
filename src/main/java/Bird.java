
import perform.FlyableI;
import perform.SingableI;
import perform.impl.Fly;
import perform.impl.NotSwim;


class Bird extends Animal implements SingableI {

  protected FlyableI flyBehaviour;

  public Bird(){
    this.flyBehaviour=new Fly();
    this.swimBehaviour= new NotSwim();
  }

  @Override
  public String sing() {
    return "I am singing";
  }

  public Boolean performFly(){
    return flyBehaviour.fly();
  }
}