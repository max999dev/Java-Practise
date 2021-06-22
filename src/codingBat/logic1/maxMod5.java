package codingBat.logic1;

public class maxMod5 {
    public int maxMod5(int a, int b) {

        if (a == b) {
            return 0;
        } else if (a > b && a % 5 == b % 5) {
            return b;
        } else if (a < b && a % 5 == b % 5) {
            return a;
        } else {
            return a > b ? a : b;
        }
    }
}
