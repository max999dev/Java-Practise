package exercises;

public class PrimeNumber {
    public static void main(String[] args) {
        //  Prime number should be greater than 1
        // and it should be divisible by 1 and itself
        //1 Checking if number is greater than 1

        int number = 11;
        int count = 0;

        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;

                } else {
                    System.out.println("Number is less than 1");
                }
                if (count == 2) {
                    System.out.println("Number is prime");
                } else {
                    System.out.println("Number is not a prime");
                }

            }
        }
    }
}