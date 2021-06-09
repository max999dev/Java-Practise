package codingBat.warmup;

public class FrontBack {
    public static void main(String[] args) {
        //Given a string, return a new string where the first and last chars have been exchanged.
        System.out.println(frontBack("")); // the output should be oello

    }

    public static String frontBack(String str) {

        if(str.isEmpty()) {
            return "";
        }else if(str.length() == 1){
            return str;
        }else if(str.length() == 2){
           return str.substring(str.length()-1) + str.charAt(0);
        }
        else {
            String middle = str.substring(1, str.length() - 1);
            return str.charAt(str.length() - 1) + middle + str.charAt(0);
        }
    }
}
