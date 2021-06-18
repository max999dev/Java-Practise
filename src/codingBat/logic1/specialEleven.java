package codingBat.logic1;

public class specialEleven {
    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static void main(String[] args) {
        System.out.println(24 % 11);
    }
}
