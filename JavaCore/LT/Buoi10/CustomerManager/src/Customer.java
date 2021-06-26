package src;

public class Customer {
    long id;
    String first_name;
    String last_name;
    String email;
    String mobilez;
    String address;
    public Customer() {}
    public Customer(long id, String first_name, String last_name, String email, String mobilez, String address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.mobilez = mobilez;
        this.address = address;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
        return mobilez;
    }
    public void setMobilez(String mobilez) {
        this.mobilez = mobilez;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return id + " - " +first_name+" - " + last_name 
        + " - " + email + " - " + mobilez + " - " + address;
    }
    
}
