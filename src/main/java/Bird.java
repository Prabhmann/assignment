import perform.FlyableI;
import perform.SingableI;

class Bird extends Animal implements FlyableI, SingableI {

  @Override
  public void fly() {
    System.out.println("I am flying");
  }

  @Override
  public void sing() {
    System.out.println("I am singing");
  }
}