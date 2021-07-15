public class Employee {
    private Long id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private double salary;

    public Employee(String name, int namSinh, String phoneNumber, String email, double salary) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [age=" + age + ", email=" + email + ", id=" + id + ", name=" + name + ", phoneNumber="
                + phoneNumber + ", salary=" + salary + "]";
    }

}
