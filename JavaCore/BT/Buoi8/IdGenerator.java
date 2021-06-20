import java.util.concurrent.locks.ReentrantLock;

public class IdGenerator {
  private static Long TacGiaId = 0L;
  private static Long DocGiaId = 0L;
  private static Long SachId = 0L;
  private static Long LineItemId = 0L;
  private static Long PhieuThueId = 0L;


  private static ReentrantLock lock = new ReentrantLock();

  private IdGenerator() {
  }

  public static Long getNewTacGiaID() {
    // Hiểu đưn giản là mỗi khi gọi getNewID thì nó sẽ trả vể id+1
    Long result;
    lock.lock();
    try {
      result = ++TacGiaId;
    } finally {
      lock.unlock();
    }
    return result;
  }

  public static Long getNewDocGiaID() {
    // Hiểu đưn giản là mỗi khi gọi getNewID thì nó sẽ trả vể id+1
    Long result;
    lock.lock();
    try {
      result = ++DocGiaId;
    } finally {
      lock.unlock();
    }
    return result;
  }

  public static Long getNewSachID() {
    // Hiểu đưn giản là mỗi khi gọi getNewID thì nó sẽ trả vể id+1
    Long result;
    lock.lock();
    try {
      result = ++SachId;
    } finally {
      lock.unlock();
    }
    return result;
  }

  public static Long getNewLineItemId() {
    // Hiểu đưn giản là mỗi khi gọi getNewID thì nó sẽ trả vể id+1
    Long result;
    lock.lock();
    try {
      result = ++LineItemId; 
    } finally {
      lock.unlock();      
    }
    return result;
  }

  public static Long getNewPhieuThueId() {
    // Hiểu đưn giản là mỗi khi gọi getNewID thì nó sẽ trả vể id+1
    Long result;
    lock.lock();
    try {
      result = ++PhieuThueId; 
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