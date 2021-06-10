package codingBat.warmup;

public class IntegerRange {
    public static void main(String[] args) {
/*
Given 2 int values, return true if they are both in the range 30..40 inclusive,
or they are both in the range 40..50 inclusive.
 */
        System.out.println(in3050(2, 4));
    }

    public static boolean in3050(int a, int b) {

        if (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50))) {
            return true;
        }
        return false;
    }
}
