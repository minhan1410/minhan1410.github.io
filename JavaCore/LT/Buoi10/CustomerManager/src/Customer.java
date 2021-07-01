public class Customer {
    long Id;
    String first_name;
    String last_name;
    String email;
    String mobile;
    String address;
    public Customer() {}
    public Customer(long id, String first_name, String last_name, String email, String mobile, String address) {
        this.Id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        this.Id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobilez() {
        return mobile;
    }
    public void setMobilez(String mobile) {
        this.mobile = mobile;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return Id + " - " +first_name+" - " + last_name 
        + " - " + email + " - " + mobile + " - " + address;
    }
    
}
