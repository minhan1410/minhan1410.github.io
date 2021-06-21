import java.time.LocalDateTime;
import java.util.List;

public class PhieuThue implements Entity{
    private Long id;
    private Readers docGia;
    private LocalDateTime ngayThue;
    private LocalDateTime ngayTra;
    private List<LineItem> items; //chi tiết từng mặt hàng trong đơn hàng

    public PhieuThue(Readers docGia, LocalDateTime ngayThue, LocalDateTime ngayTra, List<LineItem> items) {
        this.id= IdGenerator.getNewPhieuThueId();
        this.docGia = docGia;
        this.ngayThue = ngayThue;
        this.ngayTra = ngayTra;
        this.items = items;
    }

    @Override
    public Long getId() {
        return id;
    }

    public Readers getDocGia() {
        return docGia;
    }

    public void setDocGia(Readers docGia) {
        this.docGia = docGia;
    }

    public LocalDateTime getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(LocalDateTime ngayThue) {
        this.ngayThue = ngayThue;
    }

    public LocalDateTime getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDateTime ngayTra) {
        this.ngayTra = ngayTra;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "PhieuThue [id= " + id + ", docGia= " + docGia + ", items= " + items + ", ngayThue= " + ngayThue.getDayOfMonth()+" - "+ngayThue.getMonthValue()+" - "+ngayThue.getYear()
                + ", ngayTra= " + ngayTra.getDayOfMonth()+" - "+ngayTra.getMonthValue()+" - "+ngayTra.getYear() + "]";
    }
    
}
