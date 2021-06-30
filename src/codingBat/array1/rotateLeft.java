package codingBat.array1;

import java.util.Arrays;

public class rotateLeft {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft3(new int [] {1,2,3})));
    }
    private static int[] rotateLeft3(int[] nums) {
        int [] newArr = new int[nums.length];
        newArr[0] = nums[1];
        newArr[1] = nums[2];
        newArr[2] = nums[0];
        return newArr;
    }
}
