package codingBat.array1;

import java.util.Arrays;

public class makeMiddle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeMiddle(new int[]{7,1,2,3,4,5,6,6})));

    }

    private static int[] makeMiddle(int[] nums) {


        int[] newArr = new int[2];

        newArr[0] = nums[nums.length/2 - 1];
        newArr[1] = nums[nums.length/2];

        return newArr;
    }
}
