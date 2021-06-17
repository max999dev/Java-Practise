package codingBat.logic1;

public class teenSum {
    public int teenSum(int a, int b) {
        // teen range 13-19 else sum
        if(a >=13 && a <=19 || b >=13 && b <=19){
           return 19;
        }else{
            return a+b;
        }
    }
}
