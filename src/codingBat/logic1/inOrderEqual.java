package codingBat.logic1;

public class inOrderEqual {
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

        if ((a < b && b < c && !equalOk) || (a < b && b == c && equalOk) || a == b && b == c && equalOk || a == b && b < c && equalOk) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(inOrderEqual(5, 5, 7, true));
    }
}
