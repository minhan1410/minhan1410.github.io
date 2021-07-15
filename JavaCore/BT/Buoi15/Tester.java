public class Tester extends Employee {
    private int countBug;

    public Tester(String name, int namSinh, String phoneNumber, String email, long salary, int countBug) {
        super(name, namSinh, phoneNumber, email, salary);
        this.countBug = countBug;
    }

    public int getCountBug() {
        return countBug;
    }

    public void setCountBug(int countBug) {
        this.countBug = countBug;
    }

    @Override
    public long TinhLuong() {
        return super.getSalary()+countBug*50;
    }

    @Override
    public String toString() {
        return "Employee: "+super.toString()+" Tester [countBug=" +countBug+ ", Luong: "+TinhLuong()+"$ ]";
    }
}
