package codingBat.warmup;

public class lastDigit {
    public static void main(String[] args) {
        /*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
        Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
       */

        System.out.println(lastDigit(27,57));
    }

    public static boolean lastDigit(int a, int b) {
        if (a < 0 || b < 0) {
            return false;
        }else if(a % 10 == b % 10){
            return true;
        }
        return false;
    }

}
