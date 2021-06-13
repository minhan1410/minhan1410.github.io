import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

// lớp Repository là Generic class với thuộc tính là ArrayList có các kiểu dữ liệu được kế thừa từ Entity
public class Repository<T extends Entity> {
  protected ArrayList<T> collections = new ArrayList<>();

  public List<T> getAll() {
    // trả về tất cả các ptu có trong collections
    return collections;
  }


  /*
    Stream (luồng) là một đối tượng mới của Java được giới thiệu từ phiên bản Java 8,
    giúp cho việc thao tác trên collection và array trở nên dễ dàng và tối ưu hơn.
    https://gpcoder.com/3923-gioi-thieu-ve-stream-api-trong-java-8/

    filter() method là một intermediate operation, 
    cho phép chúng ta lọc các phần tử thoả các điều kiện được chỉ định
    https://shareprogramming.net/loc-cac-phan-tu-trong-collection-voi-stream-filter/

    Optional: Nó được sử dụng để kiểm tra xem một biến có giá trị tồn tại giá trị hay không
    https://gpcoder.com/3945-optional-trong-java-8/
  */
  
  public Optional<T> findById(Long id) {
    // Tìm xm trong arrayList có id cần tìm không? -> Nếu có trả về ptu đầu tiên đc tìm thấy
    return collections.stream().filter(p -> p.getId().equals(id)).findFirst();
  }

  public void add(T t) {
    // thêm ptu vào cuối ArrayList
    collections.add(t);
  }

  public void update(T t) {
    // Thay thế ptu theo ptu cho trc(Nếu trong ArrayList có id trùng vs id của ptu cho trc)
    // tìm xm trong ArrayList có ptu nào có id giống vs t(ptu cần sửa) không?  -> Nếu có thì thay thế
    for (int i = 0; i < collections.size(); i++) {
      if (collections.get(i).getId().equals(t.getId())) {
        collections.set(i, t);
      }
    }
  }


  /*
    Iterator trong Java là một interface được sử dụng để thay thế Enumerations trong Java Collection Framework. 
    Bạn có thể sử dụng interator để:
        Duyệt các phần tử từ đầu đến cuối của một collection.
        Iterator cho phép xóa phần tử khi lặp một collection.
    Có ba phương thức trong Iterator như sau:
        public boolean hasNext()	Nó trả về true nếu iterator còn phần tử kế tiếp phần tử đang duyệt.
        public object next()	    Nó trả về phần tử hiện tại và di chuyển con trỏ trỏ tới phần tử tiếp theo.
        public void remove()	    Nó loại bỏ phần tử cuối được trả về bởi Iterator. Nó hiếm khi được sử dụng.
    https://viettuts.vn/java-collection/su-dung-iterator-trong-java
  */

  public void deleteByID(Long id) {
    // Xóa ptu theo id truyền vào
    // Chuyển ArrayList thành Iterator. Duyệt từ đầu đền cuối Iterator nếu ptu nào có id trùng vs id tham chiếu thì xóa
    Iterator<T> itr = collections.iterator();
    while (itr.hasNext()) {
      T item = itr.next();
      if (item.getId().equals(id)) {
        itr.remove();
      }
    }
  }
}