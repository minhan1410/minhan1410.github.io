public abstract class Person{
    protected String name;
    protected int age;
    protected String address;
    protected String email;
    protected String phone;

    public Person() {
    }

    public Person(String name, int age, String address, String email, String phone) {
        setName(name);
        this.age = age;
        this.address = address;
        setEmail(email);
        setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Validation.lengthBetween(name, 2, 50);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = Validation.validateMobile(phone);
    }

    @Override
    public String toString() {
        return "Person [name: " + name + ",age: " + age + ",address: " + address + ",email: " + email
                + ",phone: " + phone + "]";
    }

}
