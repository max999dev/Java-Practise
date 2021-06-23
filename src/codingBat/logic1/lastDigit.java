package codingBat.logic1;

public class lastDigit {

    public static boolean lastDigit(int a, int b, int c) {
        int d = a % 10;
        int e = b % 10;
        int f = c % 10;

        if(d == e || e == f || d == f){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 39));
    }
}
