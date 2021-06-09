package codingBat.warmup;

public class stringE {
    public static void main(String[] args) {
// Return true if the given string contains between 1 and 3 'e' chars.
        System.out.println(stringE("Maruseeeea"));

    }

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        if (count > 0 && count <= 3) {
            return true;
        } else {
            return false;
        }
    }
}
