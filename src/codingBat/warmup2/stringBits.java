package codingBat.warmup2;

public class stringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("He"));
    }
    public static String stringBits(String str) {

        String newStr ="";
        for(int i =0; i < str.length();i = i+2){
            newStr += str.charAt(i);
        }
        return newStr;
    }
}
