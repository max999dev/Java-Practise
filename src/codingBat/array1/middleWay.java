package codingBat.array1;

import java.util.Arrays;

public class middleWay {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{}));

    }

    private static int[] middleWay(int[] a, int[] b) {

        int[] newArr = new int[2];
        newArr[0] = a[1];
        newArr[1] = b[1];
        return newArr;
    }
}
