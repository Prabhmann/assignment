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

}
