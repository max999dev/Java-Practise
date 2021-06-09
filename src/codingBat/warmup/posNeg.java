package codingBat.warmup;

public class posNeg {
    public static void main(String[] args) {
/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.
 */

        System.out.println(posNeg(-1,1,true));
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        // return true if one of the int is negative and parameter negative is false
        // return true when parameter negative is true and both int is negative
        if((a < 0 && b > 0 && !negative) || (a > 0 && b < 0 && !negative) ) {
            return true;
        }
        else if(a < 0 && b <0 && negative){
            return true;
        }
        return false;
    }
}
