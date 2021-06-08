package arrays;

public class PairsInArray {
    public static void main(String[] args) {
        // find all sum of 2 element that have a sum of a given number

        int[] numbers = {1, 2, 3, 4, 5, 6, 4, 7, 8, 9};
        int value = 12;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] != value) {
                    //System.out.println(numbers[i] + " + " + numbers[j] + " =  Does not match results" );
                } else {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + value);
                }

            }


        }
    }
}
