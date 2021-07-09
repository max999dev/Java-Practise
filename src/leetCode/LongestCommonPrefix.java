package leetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(LongestCommonPrefix.longestPrefix(new String[]{"hello", "heppa", "hebacci"}));
    }

    public static String longestPrefix(String[] str) {
        String prefix = "";

        if (str == null || str.length == 0) {
            return prefix;
        }

        int index = 0;

        for (char c : str[0].toCharArray()) {
            for (int i = 1; i < str.length; i++) {
                if (index > str.length || c != str[i].charAt(index)) {
                    return prefix;
                }
            }
            prefix = prefix + c;
            index++;
        }
        return prefix;

    }
}



