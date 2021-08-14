package arrays;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] my_array2 = {
                "Java",

                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        Arrays.sort(my_array1);
        Arrays.sort(my_array2);
        System.out.println(Arrays.toString(my_array1));
        System.out.println(Arrays.toString(my_array2));

        // sorting array with loop
        int[] numbers = {3,6,4,8,9,2};
        int [] sorted = new int [numbers.length];
        for(int i =0; i < numbers.length;i++){
            for(int j = i+1;j < numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    sorted[i] = numbers[i];
                }
            }
        }
        System.out.println(Arrays.toString(sorted));
    }
}
//    int[] numbers = {3,6,4,8,9,2};
//    int [] sorted = new int [numbers.length];
//        for(int i =0; i < numbers.length;i++){
//        for(int j = i+1;j < numbers.length; j++){
//        if(numbers[i] < numbers[j]){
//        sorted[i] = numbers[i];
//        }