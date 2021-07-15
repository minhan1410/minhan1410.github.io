public class Programmer extends Employee {
    private long overtime;

    public Programmer(String name, int namSinh, String phoneNumber, String email, long salary, long overtime) {
        super(name, namSinh, phoneNumber, email, salary);
        this.overtime = overtime;
    }

    public long getOvertime() {
        return overtime;
    }

    public void setOvertime(long overtime) {
        this.overtime = overtime;
    }

    @Override
    public long TinhLuong() {
        return super.getSalary()+overtime*200;
    }

    @Override
    public String toString() {
        return "Employee: "+super.toString()+" Programmer [overtime=" + overtime + ", Luong: "+TinhLuong()+"$ ]";
    }

}
