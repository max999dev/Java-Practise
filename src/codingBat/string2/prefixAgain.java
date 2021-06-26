package codingBat.string2;

public class prefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 3));

    }

    public static boolean prefixAgain(String str, int n) {

        // we have a prefix length how to check this prefix aginst thw whole string
        if (str.substring(n).contains(str.substring(0, n)))
            return true;

        return false;
    }
}

