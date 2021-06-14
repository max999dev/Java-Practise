package codingBat.warmup2;

public class has271 {
    public static void main(String[] args) {
        System.out.println(has271(new int[]{1, 2, 8,1}));
    }

    public static boolean has271(int[] nums) {


        // follow 2,7,1,pattern
        // value followed by the value +5 and followed by the value -1
        // value of i can be 0 - 4
        // value i+1  can be 5-9
        // value of i+2 can be -1 to 3

        for (int i = 0; i < nums.length; i++) {
            if ((i + 2) < nums.length && nums[i] >= 1 && nums[i] <= 3 && nums[i + 1] >= 6 && nums[i + 1] <= 8 && nums[i + 2] >= -1 && nums[i + 2] <= 3) {
                return true;
            }
        }
        return false;
    }
}
