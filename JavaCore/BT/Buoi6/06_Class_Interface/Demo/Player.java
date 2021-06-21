public class Player {
  @Override
  public String toString() {
    return "Player [name=" + name + ", no=" + no + ", position=" + position + "]";
  }

  private String name;
  private int no;
  private Position position;

  //Constructor
  public Player(String name, int no, Position position) {
    this.name = name;
    this.no = no;
    this.position = position;
  }
}
