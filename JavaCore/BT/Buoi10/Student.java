public class Student extends Person {
    private double diemTb;

    public Student() {
        this(0);
    }

    public Student(double diemTb) {
        this(0L,"", "", "", "", "", diemTb);
    }

    public Student(Long id,String name, String dateOfBirth, String address, String phone_number, String email, double diemTb) {
        super(id,name, dateOfBirth, address, phone_number, email);
        this.diemTb = diemTb;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    @Override
    public String toString() {
        return "Student [" + super.toString() + ",diemTb= " + this.diemTb + "]";
    }

}
