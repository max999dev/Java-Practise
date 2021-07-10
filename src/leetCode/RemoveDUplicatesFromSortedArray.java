package leetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDUplicatesFromSortedArray {
    public static void main(String[] args) {
//        System.out.println(RemoveDUplicatesFromSortedArray.removedDuplicatesUsingSet(new int []{1,1,2,3,4,5,6,7,8}));
        int[] sorted = {1, 1, 2, 2, 3, 4, 5, 6, 7, 8};
        // if array is unsorted use Arrays.sort(sorted);
        int[] result = new int[sorted.length]; // new array with the lenght of sorted array
        int k = 0;
        for (int i = 0; i < sorted.length - 1; i++) { // we added -1 to avoid index out of bound for i+1 condition
            if (sorted[i] != sorted[i + 1]) { // comparing element at position 0 with el at position 1
                result[k++] = sorted[i];
            }
        }
        result[k++] = sorted[sorted.length - 1]; // storing the last element in sorted array into the result array
        for (int j = 0; j < k; j++) {
            System.out.println(result[j]);
        }
    }


    public static Set<Integer> removedDuplicatesUsingSet(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int c : numbers) {
            set.add(c);
        }
        return set;
    }

}
