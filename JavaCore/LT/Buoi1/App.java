import util.SmartCar;
import CanNang.Weight;
public class App{
    public static int Sum(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum a+b= "+Sum(10, 20));

        SmartHome smartHome = new SmartHome();
        smartHome.say("1234");

        SmartCar smartCar = new SmartCar();
        smartCar.say("147");

        Weight weight = new Weight();
        System.out.println("Can nang: "+weight.ChiPhi(50));

        System.out.printf("\n%80s\n","Bảng cửu chương");
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.printf("%2d * %2d = %2d  ",j,i,i*j);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}