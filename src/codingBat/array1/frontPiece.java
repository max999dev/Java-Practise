package codingBat.array1;

import java.util.Arrays;

public class frontPiece {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frontPiece(new int []{})));
    }
    private static int[] frontPiece(int[] nums) {
        int [] arr = new int[2];
        if(nums.length < 2){
            return nums;
        }else{
            arr[0] = nums[0];
            arr[1] = nums[1];
            return arr;
        }
    }
}
