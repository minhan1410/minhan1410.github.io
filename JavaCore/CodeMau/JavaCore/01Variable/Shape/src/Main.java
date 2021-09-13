public class Main {
    public static void main(String[] args) {
        //Với hình chữ nhật
        Rectangle retangle = new Rectangle();
        System.out.println("Chu vi hình chữ nhật là: " + retangle.perimeter());
        System.out.println("Diện tích hình chữ nhật là: " + retangle.area());

        //Với hình tròn
        Circle circle = new Circle();
        System.out.println("Chu vi hình tròn là: "+circle.perimeter());
        System.out.println("Diện tích hình tròn là: "+circle.area());
    }
}
