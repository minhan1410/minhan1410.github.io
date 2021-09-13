public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static int compareByAge(Person p1, Person p2){
        return p1.getAge() - p2.getAge();
    }

    public static int compareByName(Person p1, Person p2){
        return p1.getName().compareTo(p2.getName());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + " - " + age;
    }
}
