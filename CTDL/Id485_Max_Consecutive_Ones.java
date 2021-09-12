public class Id485_Max_Consecutive_Ones {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{ 1, 1, 0, 1, 1, 1}));
    }
    
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count = 0;

        for (int i : nums) {
            if(i==1){
                count++;
                if(max<count){
                    max=count;
                }
            }else{
                count=0;
            }
        }
        return max;
    }
}
