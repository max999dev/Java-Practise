package exercises;

import java.util.Arrays;

public class CheckIfTwoArraysIsEquals {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 7};

        System.out.println(Arrays.equals(a, b));
        boolean status = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                status = true;
            }
        }
        System.out.println(status);
    }
};
