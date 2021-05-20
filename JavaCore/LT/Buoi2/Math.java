public class Math {
    public boolean isOdd(int x) {
        return x % 2 != 0;
    }

    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    public float calculateBMI(float height, float weight) {
        return weight / (height * height);
    }

    public float circle_perimeter(float diameter) {
        return 3.14f * diameter;
    }

    public boolean isTriangle(float x, float y, float z) {
        if (x + y > z && x + z > y && y + z > x) {
            return true;
        }
        return false;
    }

    public float smallestIn3Numbers(float x, float y, float z) {
        if (x < y) {
            if (x < z) {
                return x;
            } else {
                return z;
            }
        } else {
            if (y < z) {
                return y;
            } else {
                return z;
            }
        }
    }

    public float sum(int[] numbers) {
        float sum = 0f;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public float average(int[] numbers) {
        float sum = 0f;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public int[] reverseArray(int[] numbers) {
        return null;
    }

}