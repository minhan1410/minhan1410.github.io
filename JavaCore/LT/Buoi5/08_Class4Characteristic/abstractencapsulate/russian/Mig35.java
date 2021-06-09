package abstractencapsulate.russian;


public class Mig35 extends RussianFighter{
  public Mig35() {
    super("Mig35");
  }

  public void launchAntiSubmarineMissile() {
    System.out.println("Phóng tên lửa diệt tầu ngầm");
  }

  @Override
  public void callOtherJetFighter(RussianFighter otherJetFigher) {
    System.out.println("I am Mig35 from Russia. Show me your secret code.\n\t" + otherJetFigher.secretCodeCommunicate());    
  }  
}
