public class Product {
    private Long id;
    private int soLgBan,soLg;
    private String name, moTa, hang;
    private Double gia;
    private DanhMuc dm;
    
    public Product(int soLg,int soLgBan, String name, String moTa, String hang, Double gia, DanhMuc dm) {
        this.id = IdGenerator.getNewDocGiaID();
        this.soLgBan = soLgBan;
        this.name = name;
        this.moTa = moTa;
        this.hang = hang;
        this.gia = gia;
        this.dm = dm;
        this.soLg= soLg;
    }

    public int getSoLgBan() {
        return soLgBan;
    }

    public void setSoLgBan(int soLgBan) {
        this.soLgBan = soLgBan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public DanhMuc getDanhMuc() {
        return dm;
    }

    public void setDanhMuc(DanhMuc dm) {
        this.dm = dm;
    }

    public Long getId() {
        return id;
    }

    public int getSoLg() {
        return soLg;
    }

    public void setSoLg(int soLg) {
        this.soLg = soLg;
    }

    @Override
    public String toString() {
        return "Product [danh muc=" + dm + ", gia=" + gia + ", hang=" + hang + ", id=" + id + ", moTa=" + moTa + ", name="
                + name + ", soLg=" + soLg + ", soLgBan=" + soLgBan + "]";
    }
    
}
