import java.time.LocalDate;

public class HardWorkPerson extends Person{
  public HardWorkPerson(String firstName, String lastName, LocalDate birthday) {
    super(firstName, lastName, birthday);
  }

  @Override  //Nên dùng @Override khi ghi đè phương thức
  public void work() {    
    super.work();  //Gọi phương thức của lớp cha Person
    System.out.println("Continues to work 4 hours in evening");
  }

  //Class con bổ xung thêm phương thức mới
  public void workRemotelyFromHome(){
    System.out.println("Connect to Internet, and work from home");
  }
  
}
