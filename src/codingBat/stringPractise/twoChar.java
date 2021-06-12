package codingBat.stringPractise;

public class twoChar {

    public static void main(String[] args) {
/*
Given a string and an index, return a string length 2 starting at the given index.
If the index is too big or too small to define a string length 2, use the first 2 chars.
The string length will be at least 2.
 */

        System.out.println(twoChar("java", 0));
    }

    public static String twoChar(String str, int index) {

        if (index <= 0 || str.length() == index || str.length() == index + 1 || index > str.length()) {
            return str.substring(0, 2);
        } else
            return str.substring(index,index+2);
    }
}
