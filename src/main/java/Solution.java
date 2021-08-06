import perform.impl.CatSound;
import perform.impl.DogSound;

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

    Animal dog = new Animal();
    dog.setSoundBehaviour(new DogSound());

    Animal cat = new Animal();
    cat.setSoundBehaviour(new CatSound());

    Parrot parrotLivingWithDog = new Parrot(dog);
    System.out.println(parrotLivingWithDog.performSound());

    Parrot parrotLivingWithCat = new Parrot(cat);
    System.out.println(parrotLivingWithCat.performSound());

    Parrot parrotLivingWithRooster = new Parrot(rooster);
    System.out.println(parrotLivingWithRooster.performSound());

    Fish fish = new Fish();
    System.out.println(fish.performSwim());

    ClownFish clownFish = new ClownFish();
    System.out.println(clownFish.tellMeAJoke());

    Shark shark = new Shark();
    System.out.println(shark.eat(shark));


    Dolphin dolphin = new Dolphin();
    System.out.println(dolphin.performSwim());


    Catterpillar catterpillar = new Catterpillar();
    Boolean fly = catterpillar.performFly();
    System.out.println(catterpillar.walk());
    System.out.println(catterpillar.performSwim());

    catterpillar.evolveToButterfly();
    catterpillar.performFly();
  }
}