package nl.han.oose.dea.lesson8;

import java.util.Observable;
import java.util.Observer;

public class TwelveHour implements Observer {
    public void update(Observable o, Object arg) {
        Clock clock = (Clock) o;
        System.out.printf(
                "%02d:%02d:%02d\n",
                clock.getHh() % 12,
                clock.getMm(),
                clock.getSs());
    }
}
