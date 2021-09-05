public class Id771_Jewels_and_Stones {
    public static int numJewelsInStones(String jewels, String stones) {
        boolean[] flag = new boolean[123];
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            flag[jewels.charAt(i)] = true;
        }
        for (int i = 0; i < stones.length(); i++) {
            if (flag[stones.charAt(i)]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); // 3
        System.out.println(numJewelsInStones("z", "ZZ")); // 0
    }
}
