public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        System.out.println("Isodd= "+math.isOdd(4));
        System.out.println("calculateBMI= "+math.calculateBMI(1.68f, 60f));
        System.out.println("isTriangle= "+math.isTriangle(12, 10, 5));
        System.out.println("smallestIn3Numbers= "+math.smallestIn3Numbers(3,300,300));

        int a[]=new int[]{1,2,3,4,5,6,7,8};
        System.out.println("Sum= "+math.sum(a)+" - Trung binh cong= "+math.average(a));

        System.out.print("reverseArray:");
        a=math.reverseArray(a);
        for(int i=0;i<a.length; i++){
            System.out.printf("%d, ",a[i]);
        }

        System.out.println("\ncountOddNumber: "+math.countOddNumber(a));

        System.out.print("oddNumberArray:");
        int odd[]=math.oddNumberArray(a);
        for(int i=0;i<odd.length; i++){
                System.out.printf("%d, ",odd[i]);
        }

        System.out.println("\nbmiRating: "+math.bmiRating(1.68f,60));
    }
}
