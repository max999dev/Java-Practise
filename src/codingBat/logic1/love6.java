package codingBat.logic1;

public class love6 {
    public boolean love6(int a, int b) {

        if ((a == 6 || b == 6) || (a + b) == 6 || (a - b) == 6 || (b - a) == 6) {
            return true;
        } else {
            return false;
        }
    }
}
