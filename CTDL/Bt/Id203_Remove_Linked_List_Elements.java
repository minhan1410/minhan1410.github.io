// class Car {
//     private int color;

//     public Car(int color) {
//         this.color = color;
//     }

//     public int getColor() {
//         return color;
//     }

//     public void setColor(int color) {
//         this.color = color;
//     }

//     @Override
//     public String toString() {
//         return "Car [color=" + color + "]";
//     }

//     public static Car test(Car car) {
//         System.out.println("Vao test");
//         Car car2 = car;
//         System.out.println("Trc: " + car + " - " + car2);
//         car.setColor(1410);
//         System.out.println("Sau: " + car + " - " + car2);
//         car= new Car(500);
//         System.out.println("Cuoi: " + car + " - " + car2);

//         return car2;
//     }
// }

public class Id203_Remove_Linked_List_Elements {
    public static void main(String[] args) {
        // Car car = new Car(2001);
        // System.out.println("Car: "+car);
        // System.out.println(Car.test(car)+" - car: "+car);

        ListNode a1 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        ListNode.print(ListNode.removeElements(a1, 7));

        a1 = new ListNode(7, new ListNode(6, new ListNode(7, new ListNode(7))));
        ListNode.print(ListNode.removeElements(a1, 7));

        a1 = new ListNode(7, new ListNode(6, new ListNode(7, new ListNode(7))));
        ListNode.print(ListNode.removeElements(a1, 6));

        a1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6)))))));
        ListNode.print(ListNode.removeElements(a1, 6));
    }
}
