package codingBat.string2;

public class bobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("abcdefb"));
    }

    public static boolean bobThere(String str) {

        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
}

