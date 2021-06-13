/*
Sử dụng class này để sinh ra số tự nhiên duy nhất tuần tự tăng. Chỉ áp dụng cho bài toán single thread.
Khi nào sang concurrent, nhớ phải dùng Mutex Lock không là toang đấy
*/
public class IdGenerator {
  private static long id = 0L;
  public static long getNewID() {
    id += 1; //tăng thêm một mỗi lần được gọi đến
    return id;
  }
}
