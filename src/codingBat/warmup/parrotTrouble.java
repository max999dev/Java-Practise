package codingBat.warmup;

public class parrotTrouble {
    public static void main(String[] args) {
        /*
        We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
         */
        System.out.println(parrotTrouble(true, 8));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (hour >= 0 && hour <= 23) {
            if (talking && hour < 7 || talking && hour > 20) {
                return true;
            }
        }
        return false;
    }
}