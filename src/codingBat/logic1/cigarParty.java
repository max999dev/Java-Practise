package codingBat.logic1;

public class cigarParty {
    public static void main(String[] args) {

        //System.out.println(cigarParty);
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {


        if (cigars >= 40 && cigars <= 60 && !isWeekend || isWeekend && cigars >= 40) {
            return true;
        } else {
            return false;
        }
    }
}
