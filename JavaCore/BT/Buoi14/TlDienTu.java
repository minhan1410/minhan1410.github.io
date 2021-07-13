public class TlDienTu extends Book implements IDownload {
    private String dungLuong;
    private long luotTai;
    private double gia;

    public TlDienTu(String name, String nhaSb, int year, String dungLuong, long luotTai, double gia) {
        super(name, nhaSb, year);
        this.dungLuong = dungLuong;
        this.luotTai = luotTai;
        this.gia = gia;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public long getLuotTai() {
        return luotTai;
    }

    public void setLuotTai(long luotTai) {
        this.luotTai = luotTai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public Double TongTien() {
        return gia*luotTai;
    }

    @Override
    public String toString() {
        return "Sach: " + super.toString() + " - TlDienTu [dungLuong=" + dungLuong + ", gia=" + gia + ", luotTai="
                + luotTai + ", tong tien thu duoc: "+ TongTien()+"]";
    }

}
