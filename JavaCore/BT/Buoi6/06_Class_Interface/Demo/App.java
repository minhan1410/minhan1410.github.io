
public class App {
  public static void main(String[] args) {
    Team manchesterUnited = TeamFactory.manchesterUnited();
    Team barcelona = TeamFactory.barcelona();
     
    //in ra danh sách các cầu thủ trong team
    manchesterUnited.showAllPlayers();
    barcelona.showAllPlayers();

  }
}