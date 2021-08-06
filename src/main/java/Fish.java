import perform.impl.Swim;

public class Fish extends Animal {

  private String size;

  private String color;

  private Boolean isFunny;

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String tellMeAJoke() {
   if(this.isFunny){
     return "Knock Knock";
   }
   return "dont make jokes";
  }

  public void setFunny(Boolean funny) {
    isFunny = funny;
  }


  public Fish(){
    swimBehaviour = new Swim();
  }
  @Override
  public String performSound(){
    return "FISH SOUND";
  }

  @Override
  public String walk() {
    return "I can't walk";
  }

}
