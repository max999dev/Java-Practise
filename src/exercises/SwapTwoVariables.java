package exercises;

public class SwapTwoVariables {
    public static void main(String[] args) {

//        int x =5;
//        int y =10;
//
//        x = x+y;
//        y = x - y;
//        x = x-y;
//
//        System.out.println(x);
//        System.out.println(y);
//
//        String a = "Hello";
//        String b = "World";
//
//        System.out.println("Before swapping");
//        System.out.println(a);
//        System.out.println(b);


        System.out.println(SwapTwoVariables.isPalindrome(-1213121));

    }

    private static boolean isPalindrome(int x) {
        long y = 0;
        long z = x;
        for (; x != 0; x /= 10) {
            y = y * 10 + x % 10;
            System.out.println(x);
        }
        if ((y == z) && z > 0) {
            return true;
        } else if ((z < 0) && y == z) {
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(y));
            stringBuffer.deleteCharAt(0);
            stringBuffer.append("-");
            y = Integer.parseInt(stringBuffer.toString());
            return true;
        } else {
            return false;

        }
    }
};
