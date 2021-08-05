public class Parrot extends Bird {

  public Parrot(Animal neighbourAnimal) {
    this.soundBehaviour = neighbourAnimal.getSoundBehaviour();
  }

  @Override
  public String performSwim(){
    return "Unknown Behaviour";
  }

  @Override
  public Boolean performFly(){
    return Boolean.FALSE;
  }
}
