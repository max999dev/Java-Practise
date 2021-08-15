package arrays;

public class SecondSmallestEl {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 8, 9, 6, 1}; // need to find 4

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                second = smallest;
                smallest = numbers[i];

            }
            if (numbers[i] != smallest && numbers[i] > second) {

            }
        }
        System.out.println(second);
    }
}


//  for (int i = 0; i < numbers.length; i++) {
//        if (numbers[i] < smallest) {
//        second = smallest;
//        smallest = numbers[i];
//
//        }
//        if (numbers[i] != smallest && numbers[i] > second) {
//
//        }
//        }