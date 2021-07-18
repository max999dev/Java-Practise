package codingBat.array1;

public class Fix24 {
    public static void main(String[] args) {
        System.out.println(has23(new int[]{}));
    }
    private static boolean has23(int[] nums) {
        return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
    }
}
