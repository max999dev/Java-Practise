package codingBat.logic1;

public class in1To10 {
    public static void main(String[] args) {
        //  System.out.println(in1To10(99, false));
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        return n >= 1 && n <= 10 && !outsideMode || outsideMode && n <= 1 || outsideMode && n >= 10;
    }
}
