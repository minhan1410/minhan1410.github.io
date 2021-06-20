import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://viettuts.vn/java/su-dung-regex-trong-java
public class Validation {
  // định dang email trong regex
  public static final Pattern EmailRegex = 
  Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
  
  // định dạng mobile trong regex
  public static final Pattern MobileRegex = 
  Pattern.compile("^\\d{10,11}$");

  private Validation() {}

  public static String validateEmail(String email) {
    // check xm đúng định dạng email chưa
    Matcher matcher = EmailRegex.matcher(email);
    // Kt xm email có khớp vs EmailRegex? -> có thì trả về email : tung ra exception
    if (matcher.find()) {
      return email;
    } else {
      throw new RuntimeException("Email is not valid");
    }
  }

  public static String validateMobile(String mobile) {
    // check xm đúng định dạng mobile chưa
    Matcher matcher = MobileRegex.matcher(mobile);
    // Kt xm mobile có khớp vs MobileRegex? -> có thì trả về email : tung ra exception
    if (matcher.find()) {
      return mobile;
    } else {
      throw new RuntimeException("Mobile is not valid. It must have 10 to 11 digits");
    }
  }

  /*
    variadic: https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/
    int... : có vẻ giống vs mảng
    VD:
      public class Main
      {
          public static int Sum(int ... n){
              int sum=0;
              for(int i=0;i<n.length;i++){
                  sum+= n[i];
              }
              return sum;
          }
        public static void main(String[] args) {
            System.out.println(Sum());
            System.out.println(Sum(1));
            System.out.println(Sum(1,2,3,4,5));
            System.out.println(Sum(1,2,3,4,5,6,7,8,9,10));
        }
      }
*/

  public static String lengthBetween(String input, int... values) {
    if (values.length < 1 || values.length > 2) {
      throw new RuntimeException("You need to specify at least one parameter");
    }

    if (input.length() < values[0]) {
      throw new RuntimeException("Length of string must be longer than " + values[0]);
    }

    if (input.length() > values[1]) {
      throw new RuntimeException("Length of string must be less than " + values[1]);
    }
    return input;
  }
}
