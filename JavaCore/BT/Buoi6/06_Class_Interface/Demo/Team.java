import java.util.ArrayList;
import java.util.List;

public class Team {
  //Luôn để property lên đầu
  String name;
  String stadium;
  String coach;
  String establishedYear;
  private long budget; //số tiền trong quỹ của câu lạc bộ cần phải giới quyền xem
  //private giới hạn xem trong nội bộ class
  //package giới hạn xem trong nội bộ của gói phần mềm
  //private, package, public, protected là các access modifiers
  //thay đổi quyền truy xuất đến thuộc tính hoặc phương thức
  //phục vụ cho tính chất đóng gói (encapsulation)

  private List<Player> players = new ArrayList<>();
  //Nếu không khởi tạo = new ArrayList<>(); thì players sẽ nhận giá trị null
  //List là generic interface: giao diện có kiểu tổng quát
  //ArrayList là một class implement inteface List.
  //implement: là thực hiện / tuân thủ các mẫu phương thức trong interface
  //implement khác với inheritance
  //inheritance là kế thừa, và chỉ có thể kế thừa từ một class cha ~ single inheritance
  //implement có thể tuân thủ nhiều interface khác nhau.

  //Sau đó là constructor
  public Team(String name, String stadium) {
    this.name = name;
    this.stadium = stadium;
  }  

  public Team(String name, String stadium, 
  String coach, String establishedYear) {
    this.name = name;
    this.coach = coach;
    this.stadium = stadium;
    this.establishedYear = establishedYear;
  }

  //Có cả destructor

  //Tiếp là các phương thức @Override
  @Override
  public String toString() {
    return "Team [coach=" + coach + ", establishedYear=" + establishedYear + ", name=" + name + ", stadium=" + stadium
        + "]";
  }

  public String info() {
    return "Team [coach=" + coach + ", establishedYear=" + establishedYear + ", name=" + name + ", stadium=" + stadium
        + "]";
  }

  //Getter function dùng để truy xuất đến các private properties
  //Nhiều bạn thắc mắc tại sao cần phải có getter method mà không truy xuất trực tiếp
  public long getBudget() {
    //Viết logic để kiểm tra quyền truy xuất
    /*if (role == "coach" || role == "president") {
      return budget;
    } else {
      throw new Exception("Bạn không được phép xem budget");
    }
    Encapsulation là đóng gói.*/
    return budget;    
  }


  // Setter dùng để gán giá trị cho property
  public void setBudget(long budget) {
    this.budget = budget;
  }

  public void addPlayer(Player player) {
    players.add(player);
  }

  //Hãy code ở đây
  public void showAllPlayers() {
    /* cách của anh Quang Tùng */
    //dùng vòng lặp có biến đếm thì có thể in ra thư tự
    /*for(int i=0 ; i < players.size() ; i++){
      System.out.println((i + 1) + " : " + players.get(i));
    }*/

    //Kiểu này là duyệt các phần tử không sử dụng biến đếm vị trí
    //Ưu điểm: code gọn, nhìn trong sáng
    /*for (Player player : players) {
      System.out.println(player);
    }*/
    System.out.println("Team " + this.name);
    int i = 0;
    while (i < players.size()) {
      System.out.println(" " + (i + 1) + " : " + players.get(i));
      i++;
    }
  }
  //Dùng phương thức của team để khởi tạo dữ liệu nội bộ trong team là tốt nhất
  //tuân thủ tính chất Encapsulation trong OOP.
  public void loadPlayersFromCSV() {

  }

  public void getListPlayerFromREST() {

  }
}


