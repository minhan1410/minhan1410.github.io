public class Id1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0, sum = 0;

        for (int[] is : accounts) {
            for (int i : is) {
                sum += i;
            }
            max = Math.max(max, sum);
            sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        System.out.println(maximumWealth(accounts));
    }
}
