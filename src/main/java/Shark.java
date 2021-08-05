

public class Shark extends Fish {

  public Shark(){
    this.setColor("grey");
    this.setSize("Large");
    this.setFunny(Boolean.FALSE);
  }

  public String eat(Fish fish){
    if(fish instanceof Shark){
      return "Shark cannot eat shark";
    }
    return "Yum";
  }

}
