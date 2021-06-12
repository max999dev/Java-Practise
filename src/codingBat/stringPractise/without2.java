package codingBat.stringPractise;

public class without2 {
    public static void main(String[] args) {
/*
Given a string, if a length 2 substring appears at both its beginning and end,
return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
 */

        System.out.println(without2("xxx"));
    }

    public static String without2(String str) {
        if (str.length() == 1) {
            return str;
        } else if (str.isEmpty() || str.length() == 2 && str.charAt(0) == str.charAt(1)) {
            return "";
        } else if (str.length() == 3 && str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2)) {
            return str.charAt(0) + "";
        } else if (str.charAt(0) + str.charAt(1) == str.charAt(str.length() - 2) + str.charAt(str.length() - 1)) {
            return str.substring(2);
        } else {
            return str;
        }
    }
}
