import perform.impl.RoosterSound;

public class Solution {

  public static void main(String[] args) {

    Duck duck = new Duck();
    System.out.println(duck.performSound());
    System.out.println(duck.performSwim());
    duck.performFly();

    Chicken chicken = new Chicken();
    System.out.println(chicken.performSound());
    chicken.performFly();
    System.out.println(chicken.performSwim());

    Chicken rooster = new Chicken();
    rooster.setIsRooster();
    System.out.println(rooster.performSound());

  }
}