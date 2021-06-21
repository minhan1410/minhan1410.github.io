public class TeamFactory {
  //Chuyên để tạo ra các Team. Đọc tên class đã biết chức năng
  //1- Đọc từ file CSV
  //2- Đọc từ CSDL quan hệ
  //3- Gọi lên REST API từ internet rồi đổ dữ liệu vào
  public static Team manchesterUnited() {
    Team team = new Team(
      "Manchester United", 
      "Old Trafford", 
      "Ole Gunnar Solskjær",
      "1878"
    );

    team.addPlayer(new Player("David de Gea", 1, Position.GOALKEEPER));
    team.addPlayer(new Player("Victor Lindelöf", 2, Position.DEFENDER));
    team.addPlayer(new Player("Bruno Fernandes", 18, Position.MIDFIELD));
    return team;
  }

  public static Team barcelona() {
    Team team = new Team(
      "Barcelona", 
      "Nou Camp", 
      "Ronald Koeman",
      "1899"
    );

    team.addPlayer(new Player("Marc-André ter Stegen", 1, Position.GOALKEEPER));
    team.addPlayer(new Player("Gerard Piqué ", 3, Position.DEFENDER));
    team.addPlayer(new Player("Lionel Messi ", 10, Position.FORWARDER));
    return team;
  }
}
