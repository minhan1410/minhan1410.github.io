import java.time.LocalDate;

public class Person {
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
    result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)  //chính là
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (birthday == null) {
      if (other.birthday != null)
        return false;
    } else if (!birthday.equals(other.birthday))
      return false;
    if (firstName == null) {
      if (other.firstName != null)
        return false;
    } else if (!firstName.equals(other.firstName))
      return false;
    if (lastName == null) {
      if (other.lastName != null)
        return false;
    } else if (!lastName.equals(other.lastName))
      return false;
    return true;
  }
  public Person() { //Constructor không tham số
    this.firstName = "";
    this.lastName = "";
    this.birthday = LocalDate.now();
  }
  public Person(String firstName, String lastName, LocalDate birthday) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
  }

  @Override
  public String toString() {
    return "Person [birthday=" + birthday + ", firstName=" + firstName + ", lastName=" + lastName + "]";
  }
  String firstName;
  String lastName;
  LocalDate birthday;

  public void work() {
    System.out.println("work 8 hours day");
  }
}
