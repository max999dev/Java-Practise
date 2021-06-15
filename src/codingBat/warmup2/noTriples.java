package codingBat.warmup2;

public class noTriples {
    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1, 1,1}));
    }

    public static boolean noTriples(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums.length < 3) {
                return true;
            }
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }
}