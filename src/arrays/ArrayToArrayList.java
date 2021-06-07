package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        ArrayList<Integer> arr = new ArrayList<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            arr.add(numbers[i]);
        }
        System.out.println(arr);


        // convert arraylist to an array
        int[] numbers1 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            numbers1[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(numbers1));
    }
}
