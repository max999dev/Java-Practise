package codingBat.string2;

public class repeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 4));
    }

    public static String repeatEnd(String str, int n) {

        String newStr = "";
        for (int i = 0; i < n; i++) {
           newStr = newStr + str.substring(str.length()-n);
        }
        return newStr;
    }
}

