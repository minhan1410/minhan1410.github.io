public class Id121_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
//        2 ms	51.9 MB
        int max = 0, min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4})); //5
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1})); //0
    }
}
