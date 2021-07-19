package exercises;

public class Palindrome {
    public static void main(String[] args) {

        // palindrome nr

        int a = 12323;
        // checking if nr is palindrome using Stringbuffer

        StringBuffer stringBuffer =new StringBuffer(String.valueOf(a));
        if(a == Integer.parseInt(stringBuffer.reverse().toString())){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Is not palindrome");
        }

// palindrome string

        String b = "javaj";
        String c ="";
        for(int i =b.length()-1; i >=0;i--){
            c += b.charAt(i);
        }
        System.out.println(c);
        if(b.equals(c)){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("Is not palindrome");
        }
    }
}
