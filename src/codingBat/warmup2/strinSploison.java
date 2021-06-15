package codingBat.warmup2;

public class strinSploison {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }
               //CCoCoDCode
              // i  i i+1  i i+1 i+2 +str
    public static String stringSplosion(String str) {

        String newStr = "";

        for (int i = 0; i < str.length() ; i++) {
                                     // i  i+1
                newStr += str.substring(0,i+1);
        }
        return newStr;

    }
}
