package codingBat.array1;

import java.util.Arrays;

public class swapEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapEnds(new int[]{})));
    }

    private static int[] swapEnds(int[] nums) {

        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }

}
