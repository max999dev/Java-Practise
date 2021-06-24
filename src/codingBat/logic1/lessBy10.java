package codingBat.logic1;

public class lessBy10 {
    public boolean lessBy10(int a, int b, int c) {


        return a - b >= 10 || b - a >= 10 || b - c >= 10 || c - b >= 10 || a - c >= 10 || c - a >= 10;

    }
}
