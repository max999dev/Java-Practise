package codingBat.array1;

import java.util.Arrays;

public class fix23 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix23(new int[]{2,3,5})));
    }

    private static int[] fix23(int[] nums) {

        int[] newArr = new int[nums.length];

        if (nums[0] == 2 && nums[1] == 3) {
            newArr[0] = 2;
            newArr[1] = 0;
            newArr[2] = nums[2];
        } else if (nums[1] == 2 && nums[2] == 3) {
            newArr[0] = nums[0];
            newArr[1] = 2;
            newArr[2] = 0;
        } else {
            newArr[0] = nums[0];
            newArr[1] = nums[1];
            newArr[2] = nums[2];
        }
        return newArr;

    }
}
