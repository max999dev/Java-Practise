package codingBat.array1;

import java.util.Arrays;

public class midFour {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));
    }

    private static int[] midThree(int[] nums) {

        int[] newArr = new int[3];

        newArr[0] = nums[nums.length / 2 - 1];
        newArr[1] = nums[nums.length / 2];
        newArr[2] = nums[nums.length / 2 + 1];
        return newArr;
    }
}
