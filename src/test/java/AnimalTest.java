import org.junit.Assert;
import org.junit.Test;


public class AnimalTest {


  @Test
  public void testBirdWalk(){
    Bird bird = new Bird();
    bird.walk();
  }

  @Test
  public void testBirdSing(){
    Bird bird = new Bird();
    bird.sing();
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
    System.out.println(duck.performSound());
  }


  @Test
  public void testChickenSound(){
    Chicken chicken = new Chicken();
    System.out.println(chicken.performSound());
  }

}
