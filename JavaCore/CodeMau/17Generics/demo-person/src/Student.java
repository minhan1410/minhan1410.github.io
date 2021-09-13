public class Student extends Person {
    int age;
    double point;
    public Student(Long id, String name, int age, double point) {
        super(id, name);
        this.age = age;
        this.point = point;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getPoint() {
        return point;
    }
    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + age + " - " + point;
    }

   
}
