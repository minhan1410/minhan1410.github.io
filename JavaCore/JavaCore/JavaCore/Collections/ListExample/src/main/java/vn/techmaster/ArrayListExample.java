package vn.techmaster;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public void methodInArrayList(){
        //Khởi tạo ArrayList
        //Cách 1:

        ArrayList<String> animal = new ArrayList<>();

        //Cách 2
        List<String> cars = new ArrayList<>();

        //Thêm phần tử vào ArrayList
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Pig");
        animal.add("Buffalo");

        //Hiển thị thông tin ra màn hình
        System.out.println(animal);

        //Hoặc
        animal.add(2, "Horse");
        System.out.println(animal);

        //Lấy kích thước ArrayList
        int size = animal.size();
        System.out.println("Kích thước của ArrayList là: " + size);

        //Sử dụng foreach để in thông tin arraylist
        for (String arr: animal) {
            System.out.println(arr);
        }

        //Truy cập 1 phần tử trong ArrayList
        System.out.println("Phần tử có index = 3 là: "+animal.get(3));

        //Cập nhật
        animal.set(3, "Lion");
        System.out.println("Danh sách sau khi cập nhật: ");
        show(animal);

        //Xóa 1 phần tử
        animal.remove("Lion"); //Xóa dựa vào element
        animal.remove(1);   //Xóa dựa vào index
        System.out.println("Danh sách sau khi xóa: ");
        show(animal);

        //Xóa toàn bộ
        animal.clear();
        size = animal.size();
        System.out.println("Kích thước arraylist sau khi xóa: " +size);
    }

    public void show(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
