package exercises;

public class LargestNrAndSmallestNr {
    public static void main(String[] args) {
        // Largest and smallest integer in array

        int[] numbers = {-10, 23, 5, 67, -99, 109};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }else if(numbers[i] < smallest){
                smallest = numbers[i];
            }

        }
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}
