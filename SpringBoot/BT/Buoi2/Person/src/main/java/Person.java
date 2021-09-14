import java.time.Year;

public class Person {
    private String name, nationality, birthday;

    public Person(String name, String nationality, int age, String birthday) {
        this.name = name;
        this.nationality = nationality;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return Year.now().getValue() - Integer.valueOf(birthday.substring(birthday.lastIndexOf('/') + 1));
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age='" + getAge() + '\'' +
                '}';
    }
}
