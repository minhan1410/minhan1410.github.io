import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class Repository<T extends Entity> {  //Nhận vào một kiểu tổng quát tên là T. Điều kiện T phải tuân thủ interface Entity
  
  //Khai báo biến kiểu ArrayList chỉ chứa các phần tử có kiểu là T
  protected ArrayList<T> collections = new ArrayList<>();

  public List<T> getAll() {
    return collections;
  }

  public Optional<T> findById(Long id) {
    //collections.stream là cú pháp Collection + Lambda Express. Nhìn hơi hại não
    //return collections.stream().filter(p -> p.getId().equals(id)).findFirst();

    //Dùng cú pháp cổ điển để duyệt ArrayList rồi tìm phần tử theo id
    for (T item : collections) {
      if (item.getId().equals(id)) {
        return Optional.of(item);  //Có dữ liệu trả về
      }
    }
    return Optional.of(null); //Không có gì trả về. Nó khác với null bởi nó còn định kiểu trả về bên trong là T
  }

  public void add(T t) {
    collections.add(t);
  }

  public void update(T t) {
    for (int i = 0; i < collections.size(); i++) {
      if (collections.get(i).getId().equals(t.getId())) {
        collections.set(i, t);
      }
    }
  }

  public void deleteByID(Long id) {
    //Không được phép dùng vòng lặp for để xoá phần tử vì nó sẽ thay đổi kích trước của ArrayList
    //Ngược lại xoá phần tử bằng cách sử dụng Iterator thì an toàn bởi nó sử dụng liên kết next nối tiếp các phần tử với nhau
    Iterator<T> itr = collections.iterator();
    while (itr.hasNext()) {
      T item = itr.next();
      if (item.getId().equals(id)) {
        itr.remove();
      }
    }

    //Khối lệnh này gây ra java.util.ConcurrentModificationException
    /*for (T item : collections) {
      if (item.getId().equals(id)) {
        collections.remove(item);
      }
    }*/
  }
}