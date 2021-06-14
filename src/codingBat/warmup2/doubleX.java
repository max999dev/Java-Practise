package codingBat.warmup2;

public class doubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("xaxxxxx"));

    }

    static boolean doubleX(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(0) != 'x' && str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') || (str.charAt(0) == 'x' && str.charAt(1) == 'x')) {
                return true;
            }
        }
        return false;
    }
}
