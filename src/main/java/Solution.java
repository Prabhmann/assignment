import perform.impl.CatSound;
import perform.impl.DogSound;

public class Solution {

  public static void main(String[] args) {

    Bird bird = new Bird();

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

    Animal[] animals = new Animal[]{
        bird,
        duck,
        chicken,
        rooster,
        parrotLivingWithCat,
        fish,
        shark,
        clownFish,
        dog,
        catterpillar
    };

    Integer flyCount = 0;
    Integer walkCount = 0;

    Integer singCount = 0;

    Integer swimCount = 0;

    for(Animal animal: animals){
      if(animal instanceof Bird){
        Bird birdAnimal = (Bird) animal;
        if(birdAnimal.performFly()){
          flyCount++;
        }
        String sing = birdAnimal.sing();
        if(sing.equals("I am singing")){
           singCount++;
        }
      }
      final String walk = animal.walk();
      if(walk.equals("I can walk")){
        walkCount++;
      }

      String swim = animal.performSwim();
      if(swim.equals("I can swim")){
        swimCount++;
      }
    }

    System.out.println(flyCount+ " Can fly");
    System.out.println(walkCount+ " Can walk");
    System.out.println(singCount+ " Can sing");
    System.out.println(swimCount+ " Can swim");
  }
}