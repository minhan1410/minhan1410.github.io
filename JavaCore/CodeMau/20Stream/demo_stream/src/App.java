import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        // Animal animal = new Animal();
        // Repository repository = new Repository();
        // repository.printList();

        // System.out.println("Danh sách động vật có số chân bằng 4 là: ");
        // repository.getAnimalByLegs();

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);

        System.out.println("Danh sách ban đầu: ");
        numbers.forEach(num -> System.out.print(num + "\t"));

        System.out.println("\nCác phần tử chia hết cho 2: ");
        numbers.stream()
            .filter(num -> num % 2 == 0)
            .forEach(num -> System.out.print(num + "\t"));
        
        System.out.println("\nDanh sách sau khi loại bỏ 3 phần tử đầu tiên: ");
        numbers.stream()
            .skip(2)
            .forEach(num -> System.out.print(num + "\t"));

        System.out.println("\nDanh sách chỉ có 5 phần tử: ");
        numbers.stream()
            .limit(5)
            .forEach(num -> System.out.print(num + "\t"));

        System.out.println("\nDanh sách các số nhân với 10: ");
        numbers.stream()
            .map(num -> num*10)
            .forEach(num -> System.out.print(num + "\t"));

        System.out.println("Danh sach sau khi sắp xếp: ");
        numbers.stream()
            .sorted()
            .forEach(num -> System.out.print(num + "\t"));


        ArrayList<String> string = new ArrayList<>();
        string.add("Java");
        string.add("Python");
        string.add("Ruby");

        System.out.println("\nChuỗi sau khi sắp xếp: ");
        string.stream()
            .sorted()
            .forEach(str -> System.out.print(str + "\t"));

        System.out.println("\nChuỗi sau khi sắp xếp: ");
        string.stream()
            .sorted((str1, str2) -> str1.length() - str2.length())
            .forEach(str -> System.out.print(str + "\t"));

        System.out.println();
        Stream<String> stream = Stream.of("Linh", "Hung", "Hoa", "Tuan", "Dat");
        List<String> names = stream.collect(Collectors.toList());

        names.forEach(name -> System.out.print(name + "\t"));

        System.out.println();
        boolean isCheck = names.stream()
            .anyMatch((name) -> name.startsWith("H"));
        System.out.println(isCheck);

        isCheck = names.stream()
            .allMatch((name) -> name.startsWith("H"));
        System.out.println(isCheck);

        isCheck = names.stream()
            .noneMatch((name) -> name.startsWith("Z"));
        System.out.println(isCheck);


        long count = numbers.stream()
            .filter(num -> num % 2 == 0)
            .count();
        System.out.println("Có " + count + " phần tử chia hết cho 2");

        
        
    }
}
