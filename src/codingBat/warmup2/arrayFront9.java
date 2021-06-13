package codingBat.warmup2;

public class arrayFront9 {
    public static void main(String[] args) {
        System.out.println(arrayFront9(new int[]{1, 1, 3, 4}));
    }

    public static boolean arrayFront9(int[] nums) {


        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums.length <= 4 && nums[i] == 9 || nums[i + 1] == 9) {
                return true;
            }
        }
        return false;
    }
}
