package codingBat.warmup;

public class nearHundred {
    public static void main(String[] args) {
        //Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

//        double a = 123.00;
//        float b = -34.2323f;
//        double d = -999.3456;
//        System.out.println(Math.abs(a));
//        System.out.println(Math.abs(b));
//        System.out.println(Math.abs(d));

        System.out.println(nearHundred(101));

    }


    public static boolean nearHundred(int n) {

        if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
            return true;
        } else {
            return false;
        }
    }
}

