package codingBat.warmup2;

public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
    }

    public static String stringYak(String str) {

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' && str.charAt(i + 2) == 'k' && (i + 2) < str.length()) {
                i = i + 2;
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}
