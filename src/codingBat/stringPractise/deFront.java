package codingBat.stringPractise;

public class deFront {
    public static void main(String[] args) {
/*
Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char if it is 'b'.
The string may be any length. Harder than it looks.
 */
        System.out.println(deFront("aa"));
    }

    public static String deFront(String str) {

        if (str.isEmpty() || str.charAt(0) == 'a' && str.length() == 1 || str.charAt(0) != 'a' && str.charAt(1) == 'b' && str.length() == 2) {
            return "";
        } else if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
            return str.charAt(0) + str.substring(2);
        } else if (str.charAt(0) != 'a' && str.charAt(1) == 'b') {
            return str.substring(1);
        } else if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str;
        } else {
            return str.substring(2);
        }

    }
}

