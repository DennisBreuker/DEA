package nl.han.oose.dea.lesson8;

import java.util.Observable;
import java.util.Observer;

public class TwelveHour implements Observer {
    public void update(Observable o, Object arg) {
        Clock clock = (Clock) o;
        System.out.printf(
                "%02d:%02d:%02d %s\n",
                clock.getHours() % 12,
                clock.getMinutes(),
                clock.getSeconds(),
                clock.getHours() < 12 ? "AM" : "PM");
    }
}
