public class Teacher extends Person {

    long salary;

    public Teacher(Long id, String name, long salary) {
        super(id, name);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " +salary;
    }
}
