package codingBat.array1;

import java.util.Arrays;

public class make3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(make2(new int[]{}, new int[]{})));
    }

    private static int[] make2(int[] a, int[] b) {

        int[] newArr = new int[2];

        if (a.length == 0 && b.length == 0) {
            return newArr;
        } else if (a.length == 0 && b.length == 1) {
            newArr[0] = b[0];
            return newArr;
        } else if (a.length == 0 && b.length > 2) {
            newArr[0] = b[0];
            newArr[1] = b[1];
            return newArr;
        } else if (b.length == 0 && a.length == 1) {
            newArr[0] = a[0];
            return newArr;
        } else if (b.length == 0 && a.length > 2) {
            newArr[0] = a[0];
            newArr[1] = a[1];
            return newArr;
        }
        return newArr;
    }
}
