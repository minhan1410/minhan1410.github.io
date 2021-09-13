package util;

import java.util.Arrays;
import java.util.List;

public class DemoString {
  public String reverseAString(String inString) {
    StringBuilder sb = new StringBuilder();
    for (int i = inString.length() - 1; i >= 0; i--) {
      sb.append(inString.charAt(i));
    }
    return sb.toString();
  }

  public String reverseAString2(String inString) {
    return inString.transform(str -> {
      StringBuilder sb = new StringBuilder();
     /* for (int i = str.length() - 1; i >= 0; i--) {
        sb.append(str.charAt(i));
      }*/
      for (char c:str.toCharArray()) {
        sb.insert(0, c);
      }
      return sb.toString();
    });
  }

  public String reverseAString3(String inString) {
    return new StringBuilder(inString).reverse().toString();
  }

  public List<String> splitWords(String inString) {
    return inString.transform(str -> Arrays.asList(str.split("[\\s,]+"))
    );
  }

}
