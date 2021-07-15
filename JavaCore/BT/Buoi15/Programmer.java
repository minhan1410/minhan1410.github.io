public class Programmer extends Employee {
    private double overtime;

    public Programmer(String name, int namSinh, String phoneNumber, String email, double salary, double overtime) {
        super(name, namSinh, phoneNumber, email, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+overtime*200.000;
    }

    @Override
    public String toString() {
        return "Employee: "+super.toString()+" Programmer [overtime=" + overtime +", Luong: "+getSalary()+"]";
    }

}
