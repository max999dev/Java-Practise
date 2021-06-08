package arrays;

public class CommonElements {
    public static void main(String[] args) {
        // find common el in array

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] b = {8, 9, 10, 11, 12, 13, 14, 4};
        int commonEl = 0;
        int uncommonEl = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }
}
