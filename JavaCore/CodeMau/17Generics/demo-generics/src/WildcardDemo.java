import java.util.ArrayList;
import java.util.List;

public class WildcardDemo<E> {
    List<String> names;  
    List<Integer> numbers;

    public void createListName(){
        names = new ArrayList<String>();
        names.add("Mạnh");
        names.add("Linh");
        names.add("Hùng");
        print(names);
        

        
    }

    public void addElement(List<?> list, E element){
        list.add(null);
    }

    public void createListNumber(){
        numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        print(numbers);
    }

    public static void print(List<?> list){
        for (Object object : list) {
            System.out.println(object);
        }
    }

    
    
}
