package codingBat.array1;

import java.util.Arrays;

public class maxEnd3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxEnd3(new int[]{2, 1, 1})));
    }

    private static int[] maxEnd3(int[] nums) {
        // whch element is larger the first or the last
        // set the max value to the all elements in array
        int[] newArr = new int[nums.length];
        if (nums[0] > nums[nums.length - 1]) {
            newArr[0] = nums[0];
            newArr[1] = nums[0];
            newArr[2] = nums[0];
        } else if (nums[0] < nums[nums.length - 1]) {
            newArr[0] = nums[nums.length - 1];
            newArr[1] = nums[nums.length - 1];
            newArr[2] = nums[nums.length - 1];
        }  else if (nums[0] < nums[nums.length - 1]) {
        newArr[0] = nums[nums.length - 1];
        newArr[1] = nums[nums.length - 1];
        newArr[2] = nums[nums.length - 1];
    } else {
            newArr[0] = nums[nums.length - 1];
            newArr[1] = nums[nums.length - 1];
            newArr[2] = nums[nums.length - 1];
        }
        return newArr;

    }
}
