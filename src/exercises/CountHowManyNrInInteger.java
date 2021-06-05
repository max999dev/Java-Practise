package exercises;

public class CountHowManyNrInInteger {
    public static void main(String[] args) {

        // Using while loop

        int a = 12345678;
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }

        System.out.println(count);

        //using for loop
        int count1 = 0;
        for (; a > 0; a /= 10) {
            count1++;
        }
        System.out.println(count1);
    }
}
