package abstractencapsulate;

public abstract class JetFighter {
  @Override
  public String toString() {
    return "JetFighter [model=" + model + ", originCountry=" + originCountry + "]";
  }

  private final String originCountry;
  private final String model;

  /*
   * Mỗi dòng máy bay phản lực cần có mã hoá riêng để liên lạc khi bay Variables,
   * methods, and constructors, which are declared protected in a superclass can
   * be accessed only by the subclasses in other package or any class within the
   * package of the protected members' class. The protected access modifier cannot
   * be applied to class and interfaces.
   */
  protected abstract String secretCodeCommunicate();

  // Thử chuyển sang public xem VSCode gợi ý gì?
  protected JetFighter(String originCountry, String model) {
    this.originCountry = originCountry;
    this.model = model;
  }

}
