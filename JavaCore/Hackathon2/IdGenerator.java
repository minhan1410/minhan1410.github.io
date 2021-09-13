import java.util.concurrent.locks.ReentrantLock;

public class IdGenerator {
  private static Long IdBook = 0L;

  private static ReentrantLock lock = new ReentrantLock();

  private IdGenerator() {
  }

  public static Long getID() {
    // Hiểu đưn giản là mỗi khi gọi getNewID thì nó sẽ trả vể id+1
    Long result;
    lock.lock();
    try {
      result = ++IdBook;
    } finally {
      lock.unlock();
    }
    return result;
  }

}
/*
 * Lớp ReentrantLock implement interface Lock và cung cấp tính đồng bộ cho các
 * hàm truy cập tài nguyên chung.
 * 
 * ReentrantLock rl = new ReentrantLock(true) rl.tryLock(): thử yêu cầu truy cập
 * tài nguyên. Nếu tài nguyên đang ở trạng thái tự do sẽ lập tức được truy cập,
 * biến đếm = 1. Nếu thread đang chiếm giữ tài nguyên, biến đếm tăng thêm 1.
 * 
 * rl.lock(): tăng biến đếm lên 1 nếu đang chiếm giữ tài nguyên, ngược lại yêu
 * cầu truy cập tài nguyên
 * 
 * rl.unlock(): giảm biến đếm đi 1
 * 
 * https://viblo.asia/p/reentrantlock-trong-java-m68Z0AnAlkG
 */