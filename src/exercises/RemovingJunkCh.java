package exercises;

public class RemovingJunkCh {
    public static void main(String[] args) {

        // removing junk characters from a string
        String str = "5587%^&**% Hello java _)(*&";
        // must remain letters and numbers using regExp

        str = str.replaceAll("[^a-zA-Z0-9]", ""); // ^ - sign stands for skipping the characters thats needs to be removed
        System.out.println(str);

        char[] chars = str.toCharArray();
        String str1 = "";
        for (int i = 0; i < chars.length; i++) {
            int chAscii = chars[i];
            if ((chAscii <= 48 || chAscii >= 57) && (chAscii <= 65 || chAscii >= 90)) {
                continue;
            } else {
                str1 += chars[i];
            }
            System.out.println(str1);
        }
    }
}
