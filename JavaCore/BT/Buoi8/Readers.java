public class Readers extends Person implements Entity{
    private Long id;

    public Readers(String name, int age, String address, String email, String phone) {
        super(name, age, address, email, phone);
        this.id = IdGenerator.getNewDocGiaID();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DocGia (id=" + id + ",name: " + name + ",age: " + age + ",address: " + address + ",email: " + email
        + ",phone: " + phone+")";
    }

    
}
