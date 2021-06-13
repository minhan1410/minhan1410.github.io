import java.time.LocalDateTime;
import java.util.List;
// class Đơn hàng ké thừa từ Entity
public class Order implements Entity{
  private Long id;
  private Customer customer;
  private LocalDateTime orderDate;
  private String notes; //Ghi chú khi đặt hàng
  private List<LineItem> items; //chi tiết từng mặt hàng trong đơn hàng

  public Order(Customer customer, LocalDateTime orderDate, String notes, List<LineItem> items) {
    this.customer = customer;
    this.orderDate = orderDate;
    this.notes = notes;
    this.items = items;
  }
  
  @Override
  public Long getId() {
    return id;
  }
  
  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }
  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  public List<LineItem> getItems() {
    return items;
  }
  public void setItems(List<LineItem> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    String s="\t";
    for(LineItem item : items){
      s+=item+"\n\t";
    }

    return "-) Customer: " + customer.toString() + "\n"
          +"-) orderDate: " + orderDate + "\n"
          +"-) notes: " + notes + "\n" 
          +"-) items:\n" + s;
  }  
}