package codingBat.array1;

public class maxTriple {
    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1,2,3,4,5,5,6,78,8,8}));
    }

    private static int maxTriple(int[] nums) {

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums[0] > nums[nums.length / 2] && nums[0] > nums[nums.length - 1]) {
            return nums[0];
        } else if (nums[nums.length / 2] > nums[0] && nums[nums.length / 2] > nums[nums.length - 1]) {
            return nums[nums.length / 2];
        } else {
            return nums[nums.length - 1];
        }
    }
}
