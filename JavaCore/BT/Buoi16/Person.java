public class Person {
    private Long id;
    private String name;
    private int age;
    private String phoneNumber;
    private String address;

    public Person(String name, int namSinh, String phoneNumber, String address) {
        this.id=IdGenerator.getID();
        this.name = name;
        this.age = java.time.LocalDate.now().getYear() - namSinh;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int namSinh) {
        this.age = java.time.LocalDate.now().getYear() - namSinh;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Peson [address=" + address + ", age=" + age + ", id=" + id + ", name=" + name + ", phoneNumber="
                + phoneNumber + "]";
    }

    
}
