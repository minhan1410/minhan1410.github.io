public class Customer implements Entity{  
  
  private Long id; //Unique id identifies customer

  private String customerName;
  private String email;
  private String mobile;
  private String address;

  public Customer(String customerName, String email, String mobile, String address) {
    id = IdGenerator.getNewID();
    setCustomerName(customerName);
    setEmail(email);
    setMobile(mobile);
    setAddress(address);
  }

  public Long getId() {
    return id;
  }

  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = Validation.lengthBetween(customerName, 3, 50);    
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {   
    this.email = Validation.validateEmail(email);  
  }
  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = Validation.validateMobile(mobile);    
  }

  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Customer [id=" + id + ", name=" + customerName + ", email=" + email +  
    ", mobile=" + mobile + ", address=" + address +  "]";
  }
  
}
