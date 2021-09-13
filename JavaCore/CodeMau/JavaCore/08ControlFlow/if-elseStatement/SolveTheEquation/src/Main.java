public class Main {
    public static void main(String[] args) {
        double a = 5;
        double b = 7;
        double c = 1;
        Main m = new Main();
        double delta = m.deltaCalculation(a, b, c);
        System.out.println("delta = "+delta);
        m.equation(delta, a, b, c);
    }

    double deltaCalculation(double a, double b, double c){
        double delta = b*b - 4 * a * c;
        return delta;
    }

    void equation(double delta, double a, double b, double c){
        if(delta < 0){
            System.out.println("Phương trình vô nghiệm");
        } else if(delta == 0){
            double x = -b/(2*a);
            System.out.printf("Phương trình có nghiệm kép: x = %.2f", x);
        }else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }
    }
}
