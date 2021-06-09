package codingBat.warmup;

public class startOz {
    public static void main(String[] args) {
/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only
if it is 'z', so "ozymandias" yields "oz".
 */

        System.out.println(startOz(""));
    }

    public static String startOz(String str) {
// check if the length of the string is  > 2
        if (str.length() < 1) {
            return "";
        } else if (str.length() == 1 && str.charAt(0) == 'o') {
            return "o";
        } else if (str.length() >= 2 && str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            return "oz";
        } else if (str.length() >= 2 && str.charAt(0) == 'o') {
            return "o";
        } else if (str.length() >= 2 && str.charAt(1) == 'z') {
            return "z";
        }
        return "";
    }
}
