package codingBat.logic1;

public class alarmClock {
    public static void main(String[] args) {
        System.out.println(alarmClock(6, true));
    }

    public static String alarmClock(int day, boolean vacation) {

        //
        if (!vacation && day >= 1 && day <= 5) {
            return "7:00";
        } else if ((!vacation && day == 6 || !vacation && day == 0) || (vacation && day >= 1 && day <= 5)) {
            return "10:00";
        }
        return "off";
    }

}
