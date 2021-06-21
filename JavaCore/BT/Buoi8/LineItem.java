// class Thông tin đơn hàng kế thừa Entity
public class LineItem implements Entity{
  private Long id; //Unique id  
  private Integer quantity; // số lg
  private Book sach; //hang

  
  public LineItem(Book sach, Integer quantity) {
    id= IdGenerator.getNewLineItemId();
    this.sach = sach;
    this.quantity = quantity;
  }
  
  @Override
  public Long getId() {
    return id;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Book getSach() {
    return sach;
  }

  public void setSach(Book sach) {
    this.sach = sach;
  }

  @Override
  public String toString() {
    return "LineItem (id= "+id+", sach=" + sach.getName() + ", quantity=" + quantity +")";
  }

  
}
