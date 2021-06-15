package codingBat.warmup2;

public class stringTimes {
    public static void main(String[] args) {

        System.out.println(stringTimes("str", 2));
    }

    public static String stringTimes(String str, int n) {
        String a = "";
        for (int i = 0; i < n; i++) {
            a += str;
        }
        return a;
    }
}

