package codingBat.logic1;

public class caughtSpeeding {
    public static void main(String[] args) {
        //System.out.println(caughtSpeeding());
/*
0- no ticket  if 60 or <
1- small ticket 61 - 80
2- big ticket  81 >
Unless is birthday the speed can be 5 miles higher in all cases
 */


    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if (speed <= 60 && !isBirthday || speed <= 60 + 5 && isBirthday) {
            return 0;
        } else if (speed <= 80 && !isBirthday || speed <= 80 + 5 && isBirthday) {
            return 1;
        } else {
            return 2;
        }
    }
}
