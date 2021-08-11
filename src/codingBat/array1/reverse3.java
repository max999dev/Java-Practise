package codingBat.array1;

import java.util.Arrays;

public class reverse3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse3(new int[]{})));
    }

    public static int[] reverse3(int[] nums) {

        int[] newArr = new int[nums.length];
        newArr[0] = nums[nums.length - 1];
        newArr[1] = nums[1];
        newArr[newArr.length - 1] = nums[0];
        return newArr;

//        newArr[0] = nums[nums.length - 1];
//        newArr[1] = nums[1];
//        newArr[newArr.length - 1] = nums[0];

    }

}
