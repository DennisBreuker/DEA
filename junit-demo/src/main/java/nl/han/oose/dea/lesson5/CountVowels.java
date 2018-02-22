package nl.han.oose.dea.lesson5;

import java.lang.reflect.Array;

public class CountVowels {
    private static String vowels = "aeoiuy";

    public static int countVowels(String s) {
        int count = 0;
        if (s == null) {
            throw new IllegalArgumentException("Null niet toegestaan");
        }
        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
