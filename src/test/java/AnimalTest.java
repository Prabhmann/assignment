import org.junit.Assert;
import org.junit.Test;
import perform.impl.DogSound;
import perform.impl.RoosterSound;


public class AnimalTest {

   final String ANIMAL_WALKING = "I am walking";

   final String BIRD_SINGING = "I am singing";

   final String DUCK_SOUND = "Quack Quack";

  final String CHICKEN_SOUND = "Cluck, cluck";

  final String ROOSTER_SOUND = "Cock-a-doodle-doo";

  final String DOG_SOUND = "Woof, woof";

  @Test
  public void testBirdWalk(){
    Bird bird = new Bird();
    String walk = bird.walk();
    Assert.assertEquals(walk, ANIMAL_WALKING);
  }

  @Test
  public void testBirdSing(){
    Bird bird = new Bird();
    String sing = bird.sing();
    Assert.assertEquals(sing, BIRD_SINGING);
  }

  @Test
  public void testChickenFly(){
    Chicken chicken = new Chicken();
    Boolean canFly = chicken.performFly();
    Assert.assertFalse(canFly);
  }

  @Test
  public void testDuckFly(){
    Duck duck = new Duck();
    Boolean canFly = duck.performFly();
    Assert.assertTrue(canFly);
  }

  @Test
  public void testDuckSound(){
    Duck duck = new Duck();
    String sound = duck.performSound();
    Assert.assertEquals(sound, DUCK_SOUND);
  }


  @Test
  public void testChickenSound(){
    Chicken chicken = new Chicken();
    Assert.assertEquals(chicken.performSound(), CHICKEN_SOUND);
  }

  @Test
  public void testRoosterSound(){
    Chicken rooster = new Chicken();
    rooster.setIsRooster();
    Assert.assertEquals(rooster.performSound(), ROOSTER_SOUND);
  }

  @Test
  public void testParrotSound() {
    Animal dog = new Animal();
    dog.setSoundBehaviour(new DogSound());
    Parrot parrotLivingWithDog = new Parrot(dog);
    Assert.assertEquals(DOG_SOUND, parrotLivingWithDog.performSound());
  }

  @Test
  public void testSharkEatShark() {
    Shark shark = new Shark();
    Assert.assertEquals(shark.eat(shark), "Shark cannot eat shark");
  }


  @Test
  public void testClownFishTellJoke() {
    ClownFish clownFish = new ClownFish();
    Assert.assertEquals(clownFish.tellMeAJoke(), "Knock Knock");
  }
}
