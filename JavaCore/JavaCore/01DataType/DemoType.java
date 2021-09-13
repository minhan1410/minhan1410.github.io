import util.DemoString;

public final class DemoType {

  public static void demoNumber() {
    Number number = new Number();
    number.demoNumber();
    number.compareFloatNumbers();
  }

  public static void demoString() {
    DemoString demoString = new DemoString();
    String inString = "Bác Hồ ơi";
    System.out.println(demoString.reverseAString(inString));
    System.out.println(demoString.reverseAString2(inString));
    System.out.println(demoString.reverseAString3(inString));
    System.out.println(demoString.splitWords(inString));
  }
  public static void main(String[] args) {
    demoNumber();
    demoString();
  }
}