public class Database {
  // Lớp khởi tạo dữ liệu Repository: customer,product,order
  public Repository<Sach> sachRepo;
  public Repository<DocGia> docGiaRepo;
  public Repository<PhieuThue> phieuThueRepo;


  public Database() {
    sachRepo = new Repository<>();
    docGiaRepo = new Repository<>();
    phieuThueRepo = new Repository<>(); 
  }
}
