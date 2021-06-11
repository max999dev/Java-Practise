package codingBat.warmup;

public class everyNth {
    public static void main(String[] args) {
        /*
        Given a non-empty string and an int N, return the string made starting
        with char 0, and then every Nth char of the string. So if N is 3, use
        char 0, 3, 6, ... and so on. N is 1 or more.
         */
        System.out.println(everyNth("Marusea", 2));
    }

    public static String everyNth(String str, int n) {

        String newString = "";
        for (int i = 0; i < str.length(); i = i + n) {
            newString += str.charAt(i);
        }
        return newString;
    }
}
