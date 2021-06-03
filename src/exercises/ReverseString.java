package exercises;

public class ReverseString {
    public static void main(String[] args) {

        // reverse the string with for loop
        String str = "Selenium";
        int len = str.length();
        String reverse ="";
        for (int i = len-1;i>=0;i-- ){
           reverse += str.charAt(i);
        }
        System.out.println(reverse);

        // reverse the string with stringbuilder

        String str1 = "I like Java";
        StringBuilder stringBuilder = new StringBuilder(str1);
        System.out.println(stringBuilder.reverse());

    }
}
