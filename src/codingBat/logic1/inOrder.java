package codingBat.logic1;

public class inOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {

        // return true if b > a and c > b
        if (bOk && c > b || !bOk && b > a && c > b){
            return true;
        }else{
            return false;
        }


    }

}
