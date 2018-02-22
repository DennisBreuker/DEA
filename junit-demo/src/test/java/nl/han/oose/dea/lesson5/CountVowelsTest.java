package nl.han.oose.dea.lesson5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountVowelsTest {
    @Test
    public void shouldReturnOneForTest() {
        int count = CountVowels.countVowels("test");
        assertEquals(count, 1);
    }

    @Test
    public void shouldReturnZeroForWtf() {
        int count = CountVowels.countVowels("wtf");
        assertEquals(count, 0);
    }

    @Test
    public void shouldReturnSixForAllVowels() {
        int count = CountVowels.countVowels("aeiouy");
        assertEquals(count, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNull() {
        int count = CountVowels.countVowels(null);
    }
}
