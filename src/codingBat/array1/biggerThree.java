package codingBat.array1;

import java.util.Arrays;

public class biggerThree {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{}));
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA > sumB){
            return a;
        }else if(sumB > sumA){
            return b;
        }else{
            return a;
        }
    }
}
