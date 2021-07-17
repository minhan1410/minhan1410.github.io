public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int namSinh, String phoneNumber, String address, int salary) {
        super(name, namSinh, phoneNumber, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person: "+super.toString()+" - Teacher [salary=" + salary + "]";
    }
}
