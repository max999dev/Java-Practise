package codingBat.array1;

public class sameFirstLast {
    public static void main(String[] args) {
        System.out.println(sameFirstLast(new int[]{1,2,1}));
    }

    private static boolean sameFirstLast(int[] nums) {


        if (nums.length < 1) {
            return false;
        } else if (nums.length == 1) {
            return true;
        } else return nums[0] == nums[nums.length - 1];
    }
}
