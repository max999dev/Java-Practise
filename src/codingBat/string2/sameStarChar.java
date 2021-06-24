package codingBat.string2;

public class sameStarChar {
    public static void main(String[] args) {
        sameStarChar("*xy*yz*z");
    }

    public static boolean sameStarChar(String str) {

        char[] c = str.toCharArray();
        if (!str.isEmpty() && str.indexOf('*') != 0) {
            for (int i = 1; i < c.length-1; i++) {
                if (c[i] == '*' && c[i - 1] == c[i + 1] && c[i - 1] >= 97 && c[i - 1] <= 122 && c[i + 1] >= 97 && c[i + 1] <= 122) {
                    return true;
                }
            }
        }
        return false;
    }
}
