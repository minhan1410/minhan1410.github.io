public class PrimeUtil {
    public boolean isPrimeA(long number) {
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrimeB(long number) {
        int count = 0;
        for (long i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public boolean isPrime(long number) {
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long[] ArrayPrime(int n) {
        long[] array = new long[n];
        int count = 0, pos = 0;
        long number = 2;
        while (count < n) {
            if (isPrime(number)) {
                count++;
                array[pos++] = number;
            }
            number++;
        }
        return array;
    }

    public long[] createArrayPrimeNumbersB(int n) {
        long[] result = new long[n];
        int count = 0;
        int numberToCheck = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 0; i < count; i++) {
                if (numberToCheck % result[i] == 0) {
                    isPrime = false;
                    break; // không phải số nguyên tố
                }
            }
            if (isPrime) {
                result[count] = numberToCheck;
                count++;
            }
            numberToCheck++;
        }
        return result;
    }

    public long[] createArrayPrimeNumbersC(int n) {
        long[] result = new long[n];
        result[0] = 2; // Số nguyên tố đầu tiên
        int count = 0;
        int numberToCheck = 2;

        while (count < n) {
            boolean isPrime = true;
            long sqrtOfNumberToCheck = (long) Math.sqrt((double) numberToCheck); // căn bậc 2 của number

            for (int i = 0; result[i] <= sqrtOfNumberToCheck; i++) {
                if (numberToCheck % result[i] == 0) {
                    isPrime = false;
                    break; // không phải số nguyên tố
                }
            }
            if (isPrime) {
                result[count] = numberToCheck;
                count++;
            }

            numberToCheck++;
        }

        return result;
    }

    public long[] createArrayPrimeNumbersD(int n) {
        long[] result = new long[n];
        result[0] = 2; // Số nguyên tố đầu tiên
        int count = 0;
        int numberToCheck = 2;
        long sqrtOfNumberToCheck;
        boolean isPrime;

        while (count < n) {
            isPrime = true;
            sqrtOfNumberToCheck = (long) Math.sqrt((double) numberToCheck); // căn bậc 2 của number

            for (int i = 0; result[i] <= sqrtOfNumberToCheck; i++) {
                if (numberToCheck % result[i] == 0) {
                    isPrime = false;
                    break; // không phải số nguyên tố
                }
            }
            if (isPrime) {
                result[count] = numberToCheck;
                count++;
            }

            if(numberToCheck%2==0){
                numberToCheck++;
            }else{
                numberToCheck +=2;
            }
        }

        return result;
    }

    public boolean checkArrayContainsOnlyPrimeNumbers(long[] testArray) {
        for (int i = 0; i < testArray.length; i++) {
            if (!isPrime(testArray[i])) {
                System.out.println(testArray[i]);
                return false;
            }
        }
        return true;
    }
}
