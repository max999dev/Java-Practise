package exercises;

public class FIbonacci {

    public static void main(String[] args) {

        // series of numbers when every number is a sum of two precident numbers

        int a = 0;
        int b = 1;
        int sum = 0;
        int range = 12;

        for (int i = 2; i <= range; i++) {

            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum + " ");
        }


    }
}
