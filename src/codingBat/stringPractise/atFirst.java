package codingBat.stringPractise;

public class atFirst {
    public static void main(String[] args) {

/*
Given a string, return a string length 2 made of its first 2 chars.
If the string length is less than 2, use '@' for the missing chars.
 */

        System.out.println(atFirst(""));

    }

    public static String atFirst(String str) {
        if (str.isEmpty()) {
            return "@@";
        } else if (str.length() < 2) {
            return str + "@";
        } else {
            return str.substring(0, 2);
        }


    }
}
