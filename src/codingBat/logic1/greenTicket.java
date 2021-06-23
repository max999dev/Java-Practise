package codingBat.logic1;

public class greenTicket {
    public int greenTicket(int a, int b, int c) {

        if (a != b && b != c && c != a){
            return 0;
        }if( a == b && b == c){
            return 20;
        }else{
            return 10;
        }

    }
}
