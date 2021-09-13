public class Employee {
    private Long id;
    private String name;
    private String birthday;
    private GioiTinh gender;
    private String address;
    private String phoneNumber;
    private String email;

    public Employee(String name, String birthday, GioiTinh gender, String address, String phoneNumber, String email) {
        this.id=IdGenerator.getID();
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public GioiTinh getGioiTinh() {
        return gender;
    }

    public void setGioiTinh(GioiTinh gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = Validation.validateMobile(phoneNumber);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + ", birthday=" + birthday + ", email=" + email + ", gender=" + gender
                + ", id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }
}
