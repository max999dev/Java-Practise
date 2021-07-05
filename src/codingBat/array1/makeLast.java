package codingBat.array1;

import java.util.Arrays;

public class makeLast {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeLast(new int[]{0})));
    }

    private static int[] makeLast(int[] nums) {

        int[] newArr = new int[nums.length * 2];
        newArr[newArr.length - 1] = nums[nums.length - 1];

        return newArr;

    }
}
