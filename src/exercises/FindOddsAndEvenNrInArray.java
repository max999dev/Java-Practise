package exercises;

public class FindOddsAndEvenNrInArray {
    public static void main(String[] args) {


        int[] numbers = {1, 56, 73, 2, 45, 99, 56562, 662, 23};
        // find odds number and even and print them to the console
        int[] odds = {};
        int[] even = {};
        int countEven = 0;
        int countOdds = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = even[countEven++];

                // System.out.println("The number in array is even " + numbers[i]);
            } else {
                //odds[countOdds] = numbers[i];
                countOdds++;
                //System.out.println("This numbers is odds " + numbers[i]);
            }
        }
        System.out.println(odds);
        System.out.println(even);
    }
}