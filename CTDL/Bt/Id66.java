public class Id66 {
    public static void main(String[] args) {
        for (int i : plusOne(new int[] { 9, 9 })) {
            System.out.print(i);
        }
        System.out.println();

        for (int i : plusOne(new int[] { 9, 8, 9 })) {
            System.out.print(i);
        }
        System.out.println();

        for (int i : plusOne(new int[] { 5, 9, 9 })) {
            System.out.print(i);
        }
        System.out.println("\nplusOne1: Cộng với n");

        for (int i : plusOne1(new int[] { 9, 9 },5)) {
            System.out.print(i);
        }
        System.out.println();

        for (int i : plusOne1(new int[] { 9, 8, 9 },7)) {
            System.out.print(i);
        }
        System.out.println();

        for (int i : plusOne1(new int[] { 5, 9, 9 },9)) {
            System.out.print(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        int kq[] = new int[digits.length + 1];

        int soDu = 0, sum;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                sum = digits[i] + 1;
            } else {
                sum = digits[i] + soDu;
            }
            soDu = sum / 10;
            digits[i] = sum % 10;

            if (i == 0 && soDu != 0) {
                for (int j = 0; j < digits.length; j++) {
                    kq[j + 1] = digits[j];
                }

                kq[0] = soDu;
                return kq;
            }
        }

        return digits;
    }

    public static int[] plusOne1(int[] digits, int n) {
        int kq[] = new int[digits.length + 1];

        int soDu = 0, sum;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                sum = digits[i] + n;
            } else {
                sum = digits[i] + soDu;
            }
            soDu = sum / 10;
            digits[i] = sum % 10;

            if (i == 0 && soDu != 0) {
                for (int j = 0; j < digits.length; j++) {
                    kq[j + 1] = digits[j];
                }

                kq[0] = soDu;
                return kq;
            }
        }

        return digits;
    }
}
