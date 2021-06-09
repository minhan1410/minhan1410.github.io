package abstractencapsulate.russian;

import abstractencapsulate.JetFighter;

public abstract class RussianFighter extends JetFighter {
  protected RussianFighter(String model) {
    super("Russia", model); 
  }

  @Override
  protected String secretCodeCommunicate() {
    return "Moscow 1945";
  }

  public abstract void callOtherJetFighter (RussianFighter otherJetFigher);
}
