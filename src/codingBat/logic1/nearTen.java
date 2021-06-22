package codingBat.logic1;

public class nearTen {
    public static boolean nearTen(int num) {
        if (num % 10 <= 2) {
            return true;
        } else if (num - (num % 10) == 1 || num - (num % 10) == 2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(nearTen(23));

        System.out.println((23 / 10) % 10);
    }
}
