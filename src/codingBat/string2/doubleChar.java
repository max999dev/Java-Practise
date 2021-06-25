package codingBat.string2;

public class doubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("!!"));
    }

    public static String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(i) + "" + str.charAt(i);
        }
        return newStr;
    }
}
