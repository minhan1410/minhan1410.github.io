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
        int n[] = new int[numbers.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = numbers[numbers.length - 1 - i];
        }
        return n;
    }

    // Đếm số lẻ trong một mảng
    public int countOddNumber(int[] numbers) {
        int dem = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isOdd(numbers[i])) {
                dem++;
            }
        }
        return dem;
    }

    // Trả về mảng chỉ gồm các số lẻ. Ví dụ đầu vào 1, 2, 4, 5, 3 thì trả về [1, 5,
    // 3]
    public int[] oddNumberArray(int[] numbers) {
        int n[] = new int[countOddNumber(numbers)];
        int vt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isOdd(numbers[i])) {
                n[vt++] = numbers[i];
            }
        }
        return n;
    }

    /*
     * Dựa vào chỉ số BMI hãy trả về các đánh giá: Nhẹ cân, Bình thường, Quá cân,
     * Rất nguy hiểm BMI Đánh giá Dưới 18.5 Nhẹ cân 18.5—24.9 Bình thường 25.0—29.9
     * Quá cân 30.0 Rất nguy hiểm
     */
    public String bmiRating(float height, float weight) {
        float bmi = calculateBMI(height, weight);
        if (bmi < 18.5) {
            return "Nhẹ cân";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Bình thường";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Quá cân";
        } else if (bmi >= 30) {
            return "Rất nguy hiểm";
        }
        return " ";
    }
}