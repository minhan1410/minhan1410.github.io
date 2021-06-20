import java.util.List;

public class Sach implements Entity {
    private Long id;
    private String name;
    private List<String> theLoai;
    private List<TacGia> tacGia;
    private int namSx;
    private String nhaSx;
    private int soTrang;

	public Sach(String name, List<String> theLoai, List<TacGia> tacGia, int namSx, String nhaSx, int soTrang) {
        this.id = IdGenerator.getNewSachID();
        this.name = name;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
        this.namSx = namSx;
        this.nhaSx = nhaSx;
        this.soTrang = soTrang;
    }

    @Override
	public Long getId() {
		return id;
	}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(List<String> theLoai) {
        this.theLoai = theLoai;
    }

    public List<TacGia> getTacGia() {
        return tacGia;
    }

    public void setTacGia(List<TacGia> tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public String getNhaSx() {
        return nhaSx;
    }

    public void setNhaSx(String nhaSx) {
        this.nhaSx = nhaSx;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach [ id=" + id + ", namSx=" + namSx + ", name=" + name + ", nhaSx=" + nhaSx + ", soTrang=" + soTrang
                + ", tacGia=" + tacGia + ", theLoai=" + theLoai + " ]";
    }

    
}
