import perform.FlyableI;
import perform.impl.Fly;
import perform.impl.NoSound;
import perform.impl.NotFly;
import perform.impl.NotSwim;

public class Catterpillar extends Animal {

  protected FlyableI flyBehaviour;

  protected void evolveToButterfly(){
    this.flyBehaviour = new Fly();
    this.soundBehaviour = new NoSound();

  }

  public Catterpillar(){
    this.flyBehaviour= new NotFly();
    this.swimBehaviour = new NotSwim();
  }

  public Boolean performFly(){
    return flyBehaviour.fly();
  }
}
