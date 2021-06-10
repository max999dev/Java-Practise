package codingBat.warmup;

public class max1020 {

    public static void main(String[] args) {
/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
or return 0 if neither is in that range.
 */
        System.out.println(max1020(9, 9));

    }

    public static int max1020(int a, int b) {

        if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
            return a > b ? a : b;
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        } else {
            return 0;
        }

    }
}

//return a > b ? a : b;