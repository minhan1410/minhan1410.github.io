public class Id26 {
    public static void main(String[] args) {
        int n[]=new int[]{0,1,2,2,2,3,4,4,5};
        System.out.println(removeDuplicates(n));

        for (int i : n) {
            System.out.print(i+", ");
        }
    }
    
    public static int removeDuplicates(int[] nums) {
        int trung= 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[trung]) {
                nums[++trung] = nums[j];

            }
        }
        return ++trung;
    }
}
