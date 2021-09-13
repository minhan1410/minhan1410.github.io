package vn.techmaster;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        String cars[] =  {"Vinfast", "Mazda", "Ford", "Audi", "BMW"};
        System.out.println("Mảng ban đầu là: ");
        m.show(cars);

        System.out.println("Mảng sau khi sắp xếp là: ");
        m.sortArray(cars);
        m.show(cars);
    }

    public void sortArray(String arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void show(String arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
