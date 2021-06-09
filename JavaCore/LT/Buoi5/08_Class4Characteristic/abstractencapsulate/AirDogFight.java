package abstractencapsulate;

import abstractencapsulate.russian.Mig21;
import abstractencapsulate.russian.Mig35;
import abstractencapsulate.usa.F18;
import abstractencapsulate.usa.F35;

public class AirDogFight {
  public void simulate() {
    Mig35 mig35 = new Mig35();
    Mig21 mig21 = new Mig21();
    mig21.callOtherJetFighter(mig35);

    F35 f35 = new F35();
    F18 f18 = new F18();
    f35.callOtherJetFighter(f18);
  }
}
