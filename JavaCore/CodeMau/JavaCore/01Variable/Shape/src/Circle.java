public class Circle {
    int radius = 8;
    double pi = 3.14;

    double perimeter(){
        return 2 * radius * pi;
    }

    double area() {
        return radius * radius * pi;
    }
}
