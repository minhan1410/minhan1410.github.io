public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car("Ford", "F150", "2018");
        // System.out.println(car.toString());
        JsonSerializer serializer = new JsonSerializer();
        serializer.serialize(car);
    }
}
