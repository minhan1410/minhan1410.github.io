import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Ngoc", 25));
        list.add(new Person("Hoang", 30));
        list.add(new Person("Tuan", 27));
        list.add(new Person("Hoa", 20));

        show(list);


        // sử dụng Comparator
        Collections.sort(list, new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        //Sử dụng lambda
        Collections.sort(list, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        //Sử dụng lambda sắp xếp theo tên với phương thức compareByName
        Collections.sort(list, (o1, o2) -> Person.compareByName(o1, o2));
        System.out.println("Danh sách sắp xếp theo tên: ");
        show(list);

        

        //Sử dụng lambda sắp xếp theo tuổi
        Collections.sort(list, (o1, o2) -> Person.compareByAge(o1, o2));
        System.out.println("Danh sách sắp xếp theo tuổi: ");
        show(list);


        //Không sử dụng lambda
        System.out.println("Danh sách những người lớn hơn 25 tuổi là: ");
        for (Person person2 : list) {
            if(person2.getAge() > 25){
                System.out.println(person2);
            }
        }
       

        //Lọc những người có tuổi lớn hơn 25 sử dụng lambda
        System.out.println("Danh sách những người có tuổi lớn hơn 25 là:");
        list.stream().filter(person -> person.getAge() > 25)
        .forEach(person -> System.out.println(person));        
    }

    public static void show(ArrayList<Person> list){
        list.forEach(person -> System.out.println(person));
    }
}
