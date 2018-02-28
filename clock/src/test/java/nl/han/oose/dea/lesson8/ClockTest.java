package nl.han.oose.dea.lesson8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ClockTest {
    @Test
    public void Inc_9_10_11_ShouldResultIn_9_10_12() {
        Clock clock = new Clock(9, 10, 11);
        clock.incSecond();
        assertEquals(9, clock.getHh());
        assertEquals(10, clock.getMm());
        assertEquals(12, clock.getSs());
    }

    @Test
    public void Inc_9_10_59_ShouldResultIn_9_11_00() {
        Clock clock = new Clock(9, 10, 59);
        clock.incSecond();
        assertEquals(9, clock.getHh());
        assertEquals(11, clock.getMm());
        assertEquals(0, clock.getSs());
    }

    @Test
    public void Inc_11_59_59_ShouldResultIn_12_00_00() {
        Clock clock = new Clock(11, 59, 59);
        clock.incSecond();
        assertEquals(12, clock.getHh());
        assertEquals(0, clock.getMm());
        assertEquals(0, clock.getSs());
    }

    @Test
    public void Inc_13_59_59_ShouldResultIn_00_00_00() {
        Clock clock = new Clock(23, 59, 59);
        clock.incSecond();
        assertEquals(0, clock.getHh());
        assertEquals(0, clock.getMm());
        assertEquals(0, clock.getSs());
    }
}
