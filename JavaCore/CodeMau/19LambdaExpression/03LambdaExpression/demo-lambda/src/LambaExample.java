import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambaExample {
    public void example(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        numbers.add(8);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);

        //Thông thường chúng ta sử dụng for hoặc foreach để in danh sách
        for (Integer integer : numbers) {
            System.out.println(integer);
        }

        //Sử dụng lambda
        //biểu thức lambda này có 1 tham số là number và có một câu lệnh
        numbers.forEach((number)->{
            System.out.println(number);
        });

        //Sắp xếp danh sách với comparator
        numbers.sort(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1-o2;
            }   
        });

        //Nếu sử dụng lambda
        //Biểu thức lambda này có 2 tham số và một return
        numbers.sort((Integer num1, Integer num2) -> {
            return num1-num2;
        });

        System.out.println("Danh sách sau khi sắp xếp: ");
        numbers.forEach((number) -> {
            System.out.println(number);
        });

        //Loại bỏ trùng lặp với lambda
        System.out.println("Danh sách sau khi loại ỏ trùng lặp: ");
        numbers.stream()
            .distinct()
            .forEach((number) -> {
                System.out.println(number);
            });

        //Sử dụng lớp vô danh 
        AddNumber add = new AddNumber(){

            @Override
            public int sum(int num1, int num2) {
                // TODO Auto-generated method stub
                return num1 + num2;
            }
            
        };
        int sum = add.sum(7, 8);
        System.out.println("Tổng: " + sum);


        //Ta có thể sử dụng lambda để ngắn gọn hơn
        AddNumber addUsingLambda = (num1, num2) -> {
            return num1 + num2;
        };

        System.out.println("Tính tổng sử dụng lambda: " + addUsingLambda.sum(5, 3));
    }
    
}
