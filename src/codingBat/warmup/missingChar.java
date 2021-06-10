package codingBat.warmup;

public class missingChar {
    public static void main(String[] args) {
        /*
        Given a non-empty string and an int n, return a new string where the char at
        index n has been removed. The value of n will be a valid index of a char in
        the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
         */
        System.out.println(missingChar("Marusea",1));

    }
    public static String missingChar(String str, int n) {
      String newString ="";
       newString = str.substring(0,n)+str.substring(n+1);
       return newString;
    }
}
