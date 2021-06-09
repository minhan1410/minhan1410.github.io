package bank;

class Person {
  private final String name;
  private final String birthday;

  public Person(String name, String birthday) {
    this.name = name;
    this.birthday = birthday;
  }
  public String getName() {
    return name;
  }

  public String getBirthday() {
    return birthday;
  }
  @Override
  public String toString() {
    return "Person [birthday=" + birthday + ", name=" + name + "]";
  }  

  
}

