package MyMath;

public class Vector {
  @Override
  public String toString() {
    return "Vector [x=" + x + ", y=" + y + "]";
  }
  public Vector(float x, float y) {
    this.x = x;
    this.y = y;
  }
  float x;
  float y;
}
