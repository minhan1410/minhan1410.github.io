package vn.techmaster;

public class Efficiency {
    public void compareStringAndStringBuilder(){
        long start, finish, timeElapsed;
        String str1 = new String();
        String str2 = new String();
        start = System.nanoTime();
        str1 = usingString();
        System.out.println(str1);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("Cách sử dụng String: " + timeElapsed);

        start = System.nanoTime();
        str2 = usingStringBuilder();
        System.out.println(str2);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("Cách sử dụng StringBuilder: " + timeElapsed);
    }

    public String usingString(){
        String str = new String();
        for(int i = 0; i < 10; i++){
            str = str + i;
        }
        return str;
    }

    public String usingStringBuilder(){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < 10; i++){
            str.append(i);
        }
        return str.toString();
    }
}
