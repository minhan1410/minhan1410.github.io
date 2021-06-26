import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private long id;
    private String first_name, last_name, gender, country;
    private String dateOfBirth;

    public Person() {
    }

    public Person(long id, String first_name, String last_name, String gender, String country, String dateOfBirth) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.country = country;
        this.dateOfBirth= dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateOfBirth() throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person [country=" + country + ", dateOfBirth=" + dateOfBirth + ", first_name=" + first_name
                + ", gender=" + gender + ", id=" + id + ", last_name=" + last_name + "]";
    }

}
