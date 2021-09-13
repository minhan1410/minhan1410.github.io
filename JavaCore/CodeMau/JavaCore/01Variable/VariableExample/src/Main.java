public class Main {

    int globalVariable; //Biến toàn cục
    public static void main(String[] args) {
        int localVariable; //Biến cục bộ
        localVariable = 6;
        System.out.println("Giá trị biến cục bộ: "+localVariable);

        Main m = new Main();  //Tạo đối tượng m
        m.globalVariable = 10; //sử dụng biến toàn cục
        System.out.println("Giá trị biến toàn cục: "+m.globalVariable);

        m.show();

    }

    void show(){
        globalVariable = 20; //Có thể gọi tới biến toàn cục
        //localVariable = 10; //KHông thể gọi được biến cục bộ được khai báo trong phương thức main
        System.out.println("Giá trị biến toàn cục khi gọi phương thức main: " + globalVariable);
    }
}
