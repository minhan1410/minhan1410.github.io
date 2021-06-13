//Mô phỏng lớp
public class Class {
  private long id; //private, protected, package (default), public
  private String name; //10A
  private int year; //2021

  public Class(String name, int year) {
    id = IdGenerator.getNewID();
    this.name = name;
    this.year = year;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Class [id=" + id + ", name=" + name + ", year=" + year + "]";
  }

  
}
