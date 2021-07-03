import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Teacher> teachers = ReadFile.TeacherData();

        System.out.println("\nSort name teacher:");
        Collections.sort(teachers);

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        System.out.println("\nSort salary teacher:");
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getSalary() > o2.getSalary() ? 1 : -1;
            }
        });

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

// ...........................................................................

        List<Student> students = ReadFile.StudentData();

        System.out.println("\nSort name student:");
        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSort diemTb student:");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getDiemTb() > o2.getDiemTb() ? 1 : -1;
            }
        });

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
