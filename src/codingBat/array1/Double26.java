package codingBat.array1;
public class Double26 {
    public static void main(String[] args) {
        System.out.println(double26(new int[]{}));
    }

    private static boolean double26(int[] nums) {
        if (nums.length < 2) {
            return false;
        } else if (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3) {
            return true;
        }
        return false;
    }
}
