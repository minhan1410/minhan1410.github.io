public class Teacher extends Person {
    private double salary;

    public Teacher() {
        this(0);
    }

    public Teacher(double salary) {
        this(0L,"", "", "", "", "", salary);
    }

    public Teacher(Long id,String name, String dateOfBirth, String address, String phone_number, String email, double salary) {
        super(id,name, dateOfBirth, address, phone_number, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student [" + super.toString() + ",Salary= " + this.salary + "$]";
    }

}
