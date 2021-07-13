public class DoAn extends Book implements IKho {
    private int soTrang;
    private boolean tinhTrang;
    private int year;

    public DoAn(String name, String nhaSb, int year, int soTrang, boolean tinhTrang, int year2) {
        super(name, nhaSb, year);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        year = year2;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String ViTri(int vt) {
        return "Hang: "+vt;
    }

    @Override
    public String toString() {
        return "Sach: " + super.toString() + " - DoAn [soTrang=" + soTrang + ", tinhTrang=" + tinhTrang + ", year=" + year
                + "Vt: "+ViTri(6)+"]";
    }

}
