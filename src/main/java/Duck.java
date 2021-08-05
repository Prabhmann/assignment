
import perform.impl.DuckFly;
import perform.impl.DuckSound;
import perform.impl.DuckSwim;

public class Duck extends Bird {

  public Duck() {
    this.soundBehaviour = new DuckSound();
    this.swimBehaviour = new DuckSwim();
    this.flyBehaviour = new DuckFly();
  }

}
