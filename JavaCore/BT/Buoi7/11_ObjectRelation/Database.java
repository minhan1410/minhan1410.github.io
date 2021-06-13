public class Database {
  // Lớp khởi tạo dữ liệu Repository: customer,product,order
  public Repository<Customer> customerRepo;
  public Repository<Product> productRepo;
  public Repository<Order> orderRepo;

  public Database() {
    customerRepo = new Repository<>();
    productRepo = new Repository<>();
    orderRepo = new Repository<>(); 
  }
}
