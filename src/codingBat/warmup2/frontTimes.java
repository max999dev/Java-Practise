package codingBat.warmup2;

public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("C", 3));
    }

    public static String frontTimes(String str, int n) {

        StringBuilder newStr = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (str.length() > 3) {
                newStr.append(str, 0, 3);
            }
            if (str.length() <= 3) {
                newStr.append(str);
            }
        }
        return newStr.toString();
    }
}
