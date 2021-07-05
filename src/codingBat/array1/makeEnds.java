package codingBat.array1;

import java.util.Arrays;

public class makeEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeEnds(new int[]{7, 4, 6, 2})));
    }

    private static int[] makeEnds(int[] nums) {
        // given array return the new array with the length of 2 with the first and the last el from or array
        int[] newArr = new int[2];
        newArr[0] = nums[0];
        newArr[1] = nums[nums.length - 1];

        return newArr;
    }
}
