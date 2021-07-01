package codingBat.array1;

public class no23 {
    public static void main(String[] args) {
        System.out.println(no23(new int[]{1,3}));
    }

    private static boolean no23(int[] nums) {

        if (nums[0] == 2 || nums[1] == 3 || nums[0] == 3 || nums[1] == 2) {
            return false;
        }
        return true;
    }
}
