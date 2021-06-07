package exercises;

public class SumOfNrInArray {
    public static void main(String[] args) {

        int [] numbers = {34,56,78,21,76,999};
        int sum = 0;
         for(int i=0; i < numbers.length; i++){

             sum += numbers[i];
         }
        System.out.println("THe sum of numbers in given array is " + sum);

    }
}
