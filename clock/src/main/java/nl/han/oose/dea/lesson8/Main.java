package nl.han.oose.dea.lesson8;

import nl.han.oose.dea.lesson8.model.Clock;
import nl.han.oose.dea.lesson8.view.TwelveHour;
import nl.han.oose.dea.lesson8.view.TwentyFourHour;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 58);
        clock.addObserver(new TwelveHour());
        clock.addObserver(new TwentyFourHour());

        new Thread(clock).start();
    }

}
