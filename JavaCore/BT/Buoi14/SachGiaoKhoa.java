public class SachGiaoKhoa extends Book implements IMuon, IKho {
    private int soTrang;
    private boolean tinhTrang;
    private int tongSoLuong;
    private int soLgMuon;

    public SachGiaoKhoa(String name, String nhaSb, int year, int soTrang, boolean tinhTrang, int tongSoLuong,
            int soLgMuon) {
        super(name, nhaSb, year);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang; // true: con sach false: het sach
        this.tongSoLuong = tongSoLuong;
        this.soLgMuon = soLgMuon;
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

    public int getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public int getSoLgMuon() {
        return soLgMuon;
    }

    public void setSoLgMuon(int soLgMuon) {
        this.soLgMuon = soLgMuon;
    }

    @Override
    public String toString() {
        return "Sach: " + super.toString() + " - SachGiaoKhoa [soLgMuon=" + soLgMuon + ", soTrang=" + soTrang
                + ", tinhTrang=" + tinhTrang + ", tongSoLuong=" + tongSoLuong + ", tonkho: "+ TonKho()+"Vt: "+ViTri(1)+"]";
    }

    @Override
    public int TonKho() {
        return tongSoLuong - soLgMuon;
    }

    @Override
    public String ViTri(int vt) {
        return "Hang: "+vt;
    }

}
