package codingBat.array1;

public class unlucky {

    public static void main(String[] args) {
        System.out.println(unlucky1(new int[]{1,3,1}));
    }

    private static boolean unlucky1(int[] nums) {

        if (nums.length == 1 || nums.length == 0) {
            return false;
        } else if (nums.length == 2 && nums[0] == 1 && nums[1] == 3) {
            return true;
        } else if (nums.length == 3 && nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3) {
            return true;
        } else if (nums.length > 3 && nums[0] == 1 && nums[1] == 3 || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
            return true;
        }
        return false;
    }
}
