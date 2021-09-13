import java.util.ArrayList;
import java.util.Comparator;

public class MaximumDemo {

    public <T extends Comparable<T>> T findMax(T a, T b){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumDemo mDemo = new MaximumDemo();
        System.out.println("Giá trị lớn nhất trong hai số 4 , 5: " + mDemo.findMax(4, 5));
        System.out.println("Giá trị lớn nhất trong hai sô 7.6 và 4.2 : " + mDemo.findMax(7.6, 4.2));
        System.out.println("Giá trị lớn nhất trong hai chuỗi  Java và HTML: " + mDemo.findMax("Java", "HTML"));

    }
    
}
