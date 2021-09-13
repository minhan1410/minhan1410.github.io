import java.util.ArrayList;

public class PersonController<T> {
    ArrayList<T> list = new ArrayList<T>();

    public void add (T obj){
        list.add(obj);
    }
    public void display(){
        for(T object : list){
            System.out.println(object);
      }    
    }

    
}
