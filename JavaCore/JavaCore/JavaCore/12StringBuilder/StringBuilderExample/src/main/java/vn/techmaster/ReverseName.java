package vn.techmaster;

public class ReverseName {

    public String reverse(String name){
        StringBuilder output = new StringBuilder();
        name = name.trim();
        String [] array = name.split("\\s");
        for (int i = array.length - 1; i >= 0; i--){
            output.append(array[i]);
            output.append(' ');
        }

        return output.toString().trim();
    }
}
