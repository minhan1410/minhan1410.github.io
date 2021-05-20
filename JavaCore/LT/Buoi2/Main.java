public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.isOdd(4));
        System.out.println(math.calculateBMI(1.68f, 60f));
        System.out.println(math.isTriangle(12, 10, 5));
        System.out.println(math.smallestIn3Numbers(3,4,300));

        int a[]=new int[]{1,2,3,4,5,6,7,8};
        System.out.println("Sum= "+math.sum(a)+" Trung binh cong= "+math.average(a));
    }
}
