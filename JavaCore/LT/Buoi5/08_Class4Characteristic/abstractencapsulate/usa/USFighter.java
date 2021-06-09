package abstractencapsulate.usa;

import abstractencapsulate.JetFighter;

public abstract class USFighter extends JetFighter{
  //Tại sao lại là protected mà không phải public
  protected USFighter(String model) {
    super("USA", model);
  }

  @Override
  protected String secretCodeCommunicate() {
    return "New York Pearl Harbour";
  }

  public abstract void callOtherJetFighter (USFighter otherJetFigher);
  
}
