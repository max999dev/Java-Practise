package codingBat.array1;

public class sum2 {
    public static void main(String[] args) {
        System.out.println(sum2(new int[]{}));
    }

    private static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }
}
