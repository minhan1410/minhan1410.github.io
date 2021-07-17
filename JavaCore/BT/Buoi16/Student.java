public class Student extends Person {
    private double diemTb;

    public Student(String name, int namSinh, String phoneNumber, String address, double diemTb) {
        super(name, namSinh, phoneNumber, address);
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
        return "Person: "+super.toString()+" - Student [diemTb=" + diemTb + "]";
    }
}
