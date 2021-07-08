package codingBat.array1;

public class commonEnd {
    public static void main(String[] args) {
        System.out.println(commonEnd(new int[]{1, 2, 3},new int[]{7,3,2}));
    }

    public static boolean commonEnd(int[] a, int[] b) {


        if (a[0] == b[0] || b[b.length - 1] == a[a.length - 1]) {
            return true;
        }
        return false;
    }
}
