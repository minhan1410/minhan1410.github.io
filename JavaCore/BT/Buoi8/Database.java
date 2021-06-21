public class Database {
  // Lớp khởi tạo dữ liệu Repository: customer,product,order
  public Repository<Book> sachRepo;
  public Repository<Readers> docGiaRepo;
  public Repository<PhieuThue> phieuThueRepo;


  public Database() {
    sachRepo = new Repository<>();
    docGiaRepo = new Repository<>();
    phieuThueRepo = new Repository<>(); 
  }
}
