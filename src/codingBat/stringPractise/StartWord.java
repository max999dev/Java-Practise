package codingBat.stringPractise;

public class StartWord {
    public static void main(String[] args) {
/*
Given a string and a second "word" string, we'll say that the word matches the string
if it appears at the front of the string, except its first char does not need to match exactly.
On a match, return the front of the string, or otherwise return the empty string.
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
 */

        System.out.println(startWord("hello", "zelo"));
    }

    public static String startWord(String str, String word) {

        // first case when word matching the beginning of the string
        if (str.isEmpty()) {
            return "";
        }
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.charAt(0) + word.substring(1);
        }
        return "";
    }

}
