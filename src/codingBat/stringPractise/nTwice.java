package codingBat.stringPractise;

public class nTwice {
    public static void main(String[] args) {
/*
Given a string and an int n, return a string made of the first and last n chars
from the string. The string length will be at least n.
 */
        System.out.println(nTwice("Chocolate", 3));
    }

    public static String nTwice(String str, int n) {

        if (str.length() == n) {
            return str + str;
        } else if (str.length() == n + 1) {
            return str.substring(0, n) + str.substring(str.length() - n);
        } else if (n > 0) {
            return str.substring(0, n) + str.substring(str.length() - n);
        }
        return "";
    }

}
