package codingBat.logic1;

public class withoutDoubles {
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {


        if (noDoubles && (die1 == die2) && die1 != 6) {
            return die1 + die2 + 1;
        }
        if (die1 == 6 && die2 == 6 && noDoubles) {
            return die1 + 1;
        }
        return die1 + die2;
    }

    public static void main(String[] args) {
        System.out.println(withoutDoubles(6, 6, true));
    }
}
