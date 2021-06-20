public class TacGia extends Person implements Entity{
    private Long id;

    public TacGia(String name, int age, String address, String email, String phone) {
        super(name, age, address, email, phone);
        this.id =IdGenerator.getNewTacGiaID();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "TacGia (id=" + id + ",name: " + name + ",age: " + age + ",address: " + address + ",email: " + email
        + ",phone: " + phone+")";
    }
}
