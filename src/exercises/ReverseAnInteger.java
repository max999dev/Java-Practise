package exercises;

public class ReverseAnInteger {
    public static void main(String[] args) {
        // reverse an integer

        int num = 12345;
        int reverse =0;

        //using while loop
        while(num != 0){
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(reverse);

        // using for loop
        int rev = 0;
        for(;num != 0; num/=10){
            rev = rev *10 + num %10;

        }
        System.out.println(rev);

        // using stringBuffer

        long  number = 1234556789;

        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        System.out.println(stringBuffer.reverse());
    }


}
