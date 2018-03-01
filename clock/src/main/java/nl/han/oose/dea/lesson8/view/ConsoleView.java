package nl.han.oose.dea.lesson8.view;

import nl.han.oose.dea.lesson8.model.Clock;

import java.util.Observable;
import java.util.Observer;

public abstract class ConsoleView implements Observer {
    public void update(Observable o, Object arg) {
        Clock clock = (Clock) o;
        System.out.println(timeToString(clock));
    }

    public abstract String timeToString(Clock clock);
}
