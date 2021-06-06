package exercises;

import java.util.Random;

public class GenerateARandomNr {
    public static void main(String[] args) {

        //Approach nr 1
        Random random = new Random();
        int r = random.nextInt(254);
        System.out.println(r);

        // Approach nr 2 using Math class

        System.out.println(Math.random());
    }
}
