import java.util.ArrayList;
import java.util.List;

public class Util<T> {
  //Phải dùng thư viện Java Tuple
  /*public static Pair<T,T> swap<T>(T a, T b) {

  }*/

  /* Cannot create a generic array of TJava
  public T[] swap2(T a, T b) {
    return new T[]{b, a};
  }*/

  public List<T> swap(T a, T b) {
    return new ArrayList<>(List.of(b, a));
  }
}
