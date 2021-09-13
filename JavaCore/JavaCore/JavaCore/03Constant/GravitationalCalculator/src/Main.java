public class Main {
    final double GRAVITATIONAL_ACCELERATION = 9.8;
    final int RADIUS_EARTH = 6371;
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Gia tốc trọng trường ở độ cao 500km là: " + m.gravitationCalculation());
    }

    //Tính gia tốc tại độ cao 500km
    double gravitationCalculation(){
        int height = 500;

        double gravitation = GRAVITATIONAL_ACCELERATION * (Math.pow(RADIUS_EARTH, 2)/ Math.pow((RADIUS_EARTH + height), 2));
        return gravitation;
    }
}
