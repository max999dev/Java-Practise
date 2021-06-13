package codingBat.warmup2;

public class arrayCount9 {
    public static void main(String[] args) {
        System.out.println(arrayCount9(new int[]{1,2,9}));
    }

    public static int arrayCount9(int[] nums) {


        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }
}
