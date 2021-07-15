import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Programmer("name1",2001,"0123...","@gmail.com",200,8));
        list.add(new Tester("name2",2001,"0123...","@gmail.com",250,16));
        list.add(new Programmer("name3",2001,"0123...","@gmail.com",230,7));
        list.add(new Tester("name4",2004,"0123...","@gmail.com",450,14));
        list.add(new Programmer("name5",2005,"0123...","@gmail.com",500,5));
        list.add(new Tester("name6",2006,"0123...","@gmail.com",260,6));
        list.add(new Programmer("name7",2007,"0123...","@gmail.com",270,87));
        list.add(new Tester("name8",2008,"0123...","@gmail.com",850,8));
        list.add(new Programmer("name9",2009,"0123...","@gmail.com",290,9));
        list.add(new Tester("name10",2010,"0123...","@gmail.com",220,5));

        
        for (Employee nv : list) {
            System.out.println(nv);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
