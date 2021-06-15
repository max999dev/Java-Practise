package codingBat.warmup2;

public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("abccc", "abccc"));
    }

    public static int stringMatch(String a, String b) {

        int count = 0;

        if (a.length() == 0 && b.length() == 0 || a.length() == 1 && b.length() == 1 || a.length() == 1 || b.length() == 1) {
            return 0;
        } else if (a.length() < b.length()) {
            loop(b, a);
            count++;
        } else if (a.length() > b.length()) {
            loop(a, b);
            count++;
        } else if (a.length() == b.length()) {
            loop(a, b);
            count++;
        }
        return count;
    }


    private static void loop(String strMax, String strMin) {
        for (int i = 0; i < strMin.length() - 1; i++) {
            if (strMin.charAt(i) == strMax.charAt(i) && strMin.charAt(i + 1) == strMax.charAt(i + 1)) {
            }
        }
    }
}
