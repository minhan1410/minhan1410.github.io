public class Employee {
    private Long id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private long salary;

    public Employee(String name, int namSinh, String phoneNumber, String email, long salary) {
        this.id= IdGenerator.getEmployee();
        this.name = name;
        this.age = java.time.LocalDate.now().getYear()-namSinh;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int namSinh) {
        this.age = java.time.LocalDate.now().getYear()-namSinh;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [age=" + age + ", email=" + email + ", id=" + id + ", name=" + name + ", phoneNumber="
                + phoneNumber + ", salary=" + salary + "]";
    }

    public long TinhLuong(){
        return 0;
    }
}
