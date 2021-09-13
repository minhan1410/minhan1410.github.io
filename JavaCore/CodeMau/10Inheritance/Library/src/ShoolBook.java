import java.util.Scanner;

public class ShoolBook extends Library {

    private int soTrang;
    private String tinhTrang;
    private int soLuongMuon;

    public ShoolBook(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soLuong, Local viTri,
            int soTrang, String tinhTrang, int soLuongMuon) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan, soLuong, viTri);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.soLuongMuon = soLuongMuon;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap so trang: ");
        soTrang = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap tinh trang: ");
        tinhTrang = sc.nextLine();
        System.out.println("Nhap so luong muon: ");
        soLuongMuon = sc.nextInt();
    }

    public int tonKho(){
        return getSoLuong() - soLuongMuon;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +" - "+ soTrang + " - "
        +tinhTrang+" - "+ soLuongMuon + " - " + tonKho();
    }

    public ShoolBook() {
    }

    
    
}
