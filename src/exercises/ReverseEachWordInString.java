package exercises;

public class ReverseEachWordInString {
    public static void main(String[] args) {


        String str = "Welcome to java";
// splitting the words using " "
        String[] str1 = str.split(" ");
// looping thru string aof array and storing each word into a variable
        String reverseString = "";
        for (String word : str1) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
reverseString = reverseString+reverse+" ";
        }

        System.out.println(reverseString);
    }
}
