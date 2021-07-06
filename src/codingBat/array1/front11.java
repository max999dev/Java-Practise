package codingBat.array1;

import java.util.Arrays;

public class front11 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(front11(new int[]{}, new int[]{})));
    }

    private static int[] front11(int[] a, int[] b) {
        int[] arr = new int[2];

        if (a.length == 0 && b.length == 1) {
            return b;
        } else if (a.length == 1 && b.length == 0) {
            return a;
        } else {
            arr[0] = a[0];
            arr[1] = b[0];
            return arr;

        }
    }
}
