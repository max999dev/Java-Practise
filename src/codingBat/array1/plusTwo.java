package codingBat.array1;

import java.util.Arrays;

public class plusTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusTwo(new int[]{}, new int[]{})));
    }

    private static int[] plusTwo(int[] a, int[] b) {

        int[] newArr = new int[a.length + b.length];
        newArr[0] = a[0];
        newArr[1] = a[1];
        newArr[2] = b[0];
        newArr[3] = b[1];
        return newArr;
    }
}
