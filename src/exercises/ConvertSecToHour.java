package exercises;

public class ConvertSecToHour {
    public static void main(String[] args) {


        int seconds = 1286390;
        //how many seconds
        int remainingSeconds = seconds % 60;
        System.out.println(remainingSeconds);
        // how many minutes
        int minutes = seconds/60;
        int remainMinutes = minutes % 60;
        int hours = minutes / 60;

        System.out.println(remainMinutes);
        System.out.println(hours);
        System.out.println(hours+":"+remainMinutes+":"+remainingSeconds);
    }
}