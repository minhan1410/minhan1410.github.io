import java.time.LocalDate;

public class HardworkPerson extends Person {

  public HardworkPerson(String firstName, String lastName, LocalDate birthday) {
    super(firstName, lastName, birthday);
  }

  @Override
  public void work() {
    super.work();
    System.out.println("Then continues to work 4 hours more in evening");
  }
  
}
