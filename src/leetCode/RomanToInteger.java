package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("The result is " + RomanToInteger.romanToInt("MDCIV"));
    }

    public static int romanToInt(String s) {
        //1. mapping characters to their value
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //2. looping thru the String and adding condition if cur El i > previous el i = i-1 substracting from the sum
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                // IV - V is greater than I
                sum = sum + map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1)); // 5 - 1
            } else {
                sum = sum + map.get(s.charAt(i));
            }
        }
        return sum;
    }
}