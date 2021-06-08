package arrays;

public class DifBetweenLargestAndSmallestNr {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 4, 7, 8, 9};
        // result must be 9 - 1 = 8
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int difference = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
           // System.out.println(largest);
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] < smallest) {
                    smallest = numbers[j];
                }
            }
        System.out.println(smallest);
        difference = largest - smallest;
        System.out.println("The difference between the largest and smallest number is " + difference);

        }
    }
