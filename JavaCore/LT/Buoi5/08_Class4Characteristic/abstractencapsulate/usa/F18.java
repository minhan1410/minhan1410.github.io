package abstractencapsulate.usa;

public class F18 extends USFighter {

  public F18() {
    super("F18");
  }

  public void launchAirStrike() {
    System.out.println("Phóng tên lửa tầm nhiệt");
  }

  @Override
  public void callOtherJetFighter(USFighter otherJetFigher) {
    System.out.println("I am F18. Show me secret code\n\t" + otherJetFigher.secretCodeCommunicate());   
  }
  
}
