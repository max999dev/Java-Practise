package exercises;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args) {

        int [] numbers = {1,3,5,7,53,9,6,12};
        // Known method by using Arrays.sort()
       // Arrays.sort(numbers);

        // approach nr 2
        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
