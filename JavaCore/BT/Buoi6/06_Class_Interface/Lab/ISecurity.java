public interface ISecurity {
  void kiemTraThanNhiet();
  void kiemTraDanhTinh();
  void chaoHoiKhachHang();

  //Từ Java 8 trở đi, có thể khai báo static method trong interface
  static String getKeyCode() {
    return KEY;
  }
  //The method doPrivateThing() from the type ISecurity is never used locally
  private void doPrivateThing() {
     System.out.println("do private thing");
  }

  //
  public void doOtherthing() {
    System.out.println("doOtherthing");
  }

  public final String AGE ="TEST";

  //Nhưng không thể khai báo non static method có cả phần code implementation
  // bên trong một interface

  //Các thuộc tính thì cần bổ xung keyword static
  static String BADGET = "Demo";
  static String KEY = "ABC"; //Nó không hợp lý, mặc dù cú pháp cho phép. Bản chất nó nên là static

  //Thuộc tính bên trong một interface dù khai báo static hay không đều có tính chất static
}
