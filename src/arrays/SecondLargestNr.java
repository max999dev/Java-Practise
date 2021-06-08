package arrays;

public class SecondLargestNr {
    public static void main(String[] args) {
        //int [] numbers = {1,2,3,4,5,6,7,8,9,12};
        // in sorted array second largest would be numbers[numbers.lenght-2]
        int[] numbers = {12, 11, 34, 9, 8, 7, 6, 5};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                second = largest;
                largest = numbers[i];
            }
            if (numbers[i] != largest && numbers[i] > second) {
                second = numbers[i];
            }
        }
        System.out.println(second);
    }
}