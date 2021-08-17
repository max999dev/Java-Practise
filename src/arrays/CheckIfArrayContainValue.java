package arrays;

public class CheckIfArrayContainValue {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        int value = 1458;
        int index = 0;
        for (int i = 0; i < my_array1.length; i++) {
            if (value == my_array1[i]) {
                index = i;
            } else {
                //System.out.println("Nothing found");
            }
        }
        System.out.println("The element " + value + " Is located at index" + index);
        int b = 5;
        String a = "abc";
        for (int i = 0; i <= b; i++) {
            a += a;
        }
        System.out.println(a);

    }
}
//System.out.println("The element " + value + " Is located at index" + index);
//        int b = 5;
//        String a = "abc";
//        for (int i = 0; i <= b; i++) {
//        a += a;
//        }
//        System.out.println(a);