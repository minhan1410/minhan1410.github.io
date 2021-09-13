package vn.techmaster;

import java.util.LinkedList;

public class LinkedListExample {
    public void methodInLinkedList(){
        //KHởi tạo
        LinkedList<String> cars = new LinkedList<>();

        //Thêm phần tử
        cars.add("Vinfast");
        cars.add("Toyota");
        cars.add("Ford");
        System.out.println("Danh sách ban đầu: ");
        show(cars);


        cars.add(2, "Audi");
        System.out.println("Danh sách sau khi thêm vào index 2: ");
        show(cars);

        cars.addFirst("Huyndai");
        cars.addLast("BMW");
        System.out.println("Danh sách sau khi thêm vào cuối và đầu danh sách");
        show(cars);

        int size = cars.size();
        System.out.println("Kích thước của list là: " +size);

        //Lấy một phần tử
        String car = cars.get(1);
        System.out.println("Phần tử có index = 1: " +car);

        //Lấy phần tử đàu tiên:
        String firstCar = cars.getFirst();
        System.out.println("Phần tử ở vị trí đầu tiên: " +firstCar);

        //Lấy phần tử vị trí cuối cùng
        String lastCar = cars.getLast();
        System.out.println("Phần tử ở vị trí cuối cùng: "+lastCar);

        //Cập nhật
        cars.set(4, "Chevrolet");
        System.out.println("Danh sách sau khi cập nhật là: ");
        show(cars);

        //Trả về phần tử đầu tiên và xóa nó khỏi danh sách
        String first = cars.poll();
        //HOặc sử dụng pollFirst()
        System.out.println("Phần tử đầu tiên: " + first);
        System.out.println("Danh sách sau khi xóa "+first+" :");
        show(cars);

        cars.clear();

        //Trả về phần tử cuối cùng và xóa nó khỏi danh sách
        String last = cars.pollLast();  //trả về null nếu danh sách rỗng
        System.out.println("Phần tử cuối cùng: " + last);
        System.out.println("Danh sách sau khi xóa "+last+" :");
        show(cars);

        //Xóa với remove
        //Xóa phần tử đầu tiên
        cars.remove();  //Báo exception
        System.out.println("Danh schs sau khi xóa phần tử đầu tiên: ");
        show(cars);
        //Hoặc cars.removeFirst();

        cars.remove(3);  //Xóa tại vị trí index
        cars.remove("Ford");  //Xóa dựa vào element
        System.out.println("Danh sách sau khi xóa phần tử chỉ định: ");
        show(cars);

        //Xóa phần tử cuối cùng
        cars.removeLast();
        System.out.println("Danh sách sau khi xóa phần tử cuối cùng: ");
        show(cars);

        //Xóa hết
        cars.clear();
        size = cars.size();
        System.out.println("Kích thước sau khi xóa: " + size);






    }
    public void show(LinkedList list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
