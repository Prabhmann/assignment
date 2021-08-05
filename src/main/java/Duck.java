
import perform.impl.DuckFly;
import perform.impl.DuckSound;
import perform.impl.Swim;

public class Duck extends Bird {

  public Duck() {
    this.soundBehaviour = new DuckSound();
    this.swimBehaviour = new Swim();
    this.flyBehaviour = new DuckFly();
  }

}
